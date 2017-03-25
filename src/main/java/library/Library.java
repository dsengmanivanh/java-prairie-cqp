package library;


import library.model.Book;
import library.model.CD;
import library.model.DVD;

import java.util.ArrayList;
import java.util.HashSet;

public class Library implements ILibrary {

    private final int CLOSE = 7;
    private final int OPEN = 1;
    private final int STORAGE_MAX = 3;

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<DVD> dvds = new ArrayList<>();
    private ArrayList<CD> cds = new ArrayList<>();

    @Override
    public boolean isOpen(int hour) {
        return hour >= OPEN && hour <= CLOSE;
    }

    @Override
    public ArrayList<Book> putBooks(ArrayList<Book> books) {
        this.books.addAll(books);
        return this.books;
    }

    @Override
    public ArrayList<CD> putCDs(ArrayList<CD> cds) {
        this.cds.addAll(cds);
        return this.cds;
    }

    @Override
    public ArrayList<DVD> putDvds(ArrayList<DVD> dvds) {
        int sizeTotal = dvds.size() + this.dvds.size();
        if (sizeTotal <= STORAGE_MAX && !verifyDoubleFromDvds(dvds)) {
            this.dvds.addAll(dvds);
            if (verifyDoubleOnDvds()) {
                for (DVD dvd : dvds) {
                    this.dvds.remove(dvd);
                }
            }
        }
        return this.dvds;
    }

    private boolean verifyDoubleOnDvds() {
        HashSet<DVD> dvdsSet = new HashSet<>(this.dvds);
        return dvdsSet.size() != this.dvds.size();
    }

    private boolean verifyDoubleFromDvds(ArrayList<DVD> dvds) {
        boolean hasDouble = false;
        for (DVD dvd : dvds) {
            if (this.dvds.contains(dvd)) {
                hasDouble = true;
            }
        }
        return hasDouble;
    }

}
