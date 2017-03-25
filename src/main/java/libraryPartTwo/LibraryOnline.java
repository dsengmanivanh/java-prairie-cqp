package libraryPartTwo;


import libraryPartTwo.model.Book;
import libraryPartTwo.model.CD;
import libraryPartTwo.model.DVD;
import libraryPartTwo.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class LibraryOnline implements ILibrary {

    private List<Book> books = new ArrayList<>();
    private List<DVD> dvds = new ArrayList<>();
    private List<CD> cds = new ArrayList<>();
    private final int OUTSIDE_SEVEN = 7;
    private final int OUTSIDE_ONE = 1;

    private int hour = 8;

    private boolean isOpen() {
        return this.hour <= OUTSIDE_ONE || this.hour >= OUTSIDE_SEVEN;
    }

    @Override
    public List<Book> putBooks(List<Book> books) {
        if (isOpen()) {
            for (Book book : books) {
                book.setShippingDay(1);
                this.books.add(book);
            }
        }
        return this.books;
    }

    @Override
    public List<DVD> putDvds(List<DVD> dvds) {
        if (isOpen()) {
            for (DVD dvd : dvds) {
                if (dvd.getKind() == Movie.HORROR) {
                    dvd.setShippingDay(1);
                } else if (dvd.isThreeD()) {
                    dvd.setShippingDay(3);
                } else {
                    dvd.setShippingDay(2);
                }
            }
            this.dvds.addAll(dvds);
        }
        return this.dvds;
    }

    @Override
    public List<CD> putCDs(List<CD> cds) {
        if (isOpen()) {
            for (CD cd : cds) {
                cd.setShippingDay(3);
                this.cds.add(cd);
            }
        }
        return this.cds;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
