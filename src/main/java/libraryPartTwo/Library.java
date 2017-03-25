package libraryPartTwo;


import libraryPartTwo.model.Book;
import libraryPartTwo.model.CD;
import libraryPartTwo.model.DVD;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Library implements ILibrary {

    private final int CLOSE = 7;
    private final int OPEN = 1;
    private final int STORAGE_MAX = 3;

    private List<Book> books = new ArrayList<>();
    private List<DVD> dvds = new ArrayList<>();
    private List<CD> cds = new ArrayList<>();

    private int hour = 3;

    private boolean isOpen() {
        return hour >= OPEN && hour <= CLOSE;
    }

    @Override
    public List<Book> putBooks(List<Book> books) {
        if (isOpen()) {
            this.books.addAll(books);
        }
        return this.books;
    }

    @Override
    public List<CD> putCDs(List<CD> cds) {
        if (isOpen()) {
            this.cds.addAll(cds);
        }
        return this.cds;
    }

    @Override
    public List<DVD> putDvds(List<DVD> dvds) {
        if (isOpen()) {
            int sizeTotal = dvds.size() + this.dvds.size();
            if (sizeTotal <= STORAGE_MAX && !verifyDoubleFromDvds(dvds)) {
                this.dvds.addAll(dvds);
                if (verifyDoubleOnDvds()) {
                    for (DVD dvd : dvds) {
                        this.dvds.remove(dvd);
                    }
                }
            }
        }
        return this.dvds;
    }

    private boolean verifyDoubleOnDvds() {
        HashSet<DVD> dvdsSet = new HashSet<>(this.dvds);
        return dvdsSet.size() != this.dvds.size();
    }

    private boolean verifyDoubleFromDvds(List<DVD> dvds) {
        boolean hasDouble = false;
        for (DVD dvd : dvds) {
            if (this.dvds.contains(dvd)) {
                hasDouble = true;
            }
        }
        return hasDouble;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

}
