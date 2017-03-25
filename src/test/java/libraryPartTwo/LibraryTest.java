package libraryPartTwo;


import libraryPartTwo.model.Book;
import libraryPartTwo.model.CD;
import libraryPartTwo.model.DVD;
import libraryPartTwo.model.Movie;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;


public class LibraryTest {

    @Test
    public void putBook_with_two_books_and_open_hour() {
        //set
        Library library = new Library();
        library.setHour(3);
        Book book1 = new Book("book1", 100, 0);
        Book book2 = new Book("book2", 150, 0);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        //test
        List<Book> result = library.putBooks(books);
        //assert
        assertEquals(2, result.size());
    }

    @Test
    public void putBook_with_two_books_and_hour_online() {
        //set
        Library library = new Library();
        library.setHour(10);
        Book book1 = new Book("book1", 100, 0);
        Book book2 = new Book("book2", 150, 0);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        //test
        List<Book> result = library.putBooks(books);
        //assert
        assertEquals(0, result.size());
    }

    @Test
    public void putCds_with_two_cds_and_open_hour() {
        //set
        Library library = new Library();
        library.setHour(3);
        CD cd = new CD("cd", 120, 0);
        CD cd1 = new CD("cd1", 120, 0);
        ArrayList<CD> cds = new ArrayList<>();
        cds.add(cd);
        cds.add(cd1);
        //test
        List<CD> result = library.putCDs(cds);
        //assert
        assertEquals(2, result.size());
    }

    @Test
    public void putCds_with_two_cds_and_hour_online() {
        //set
        Library library = new Library();
        library.setHour(10);
        CD cd = new CD("cd", 120, 0);
        CD cd1 = new CD("cd1", 120, 0);
        ArrayList<CD> cds = new ArrayList<>();
        cds.add(cd);
        cds.add(cd1);
        //test
        List<CD> result = library.putCDs(cds);
        //assert
        assertEquals(0, result.size());
    }

    @Test
    public void putDvds_with_two_dvds_and_open_hour() {
        //set
        Library library = new Library();
        library.setHour(3);
        DVD dvd = new DVD("dvd", 120, 0, Movie.ACTION, true);
        DVD dvd1 = new DVD("dvd1", 100, 0, Movie.HORROR, false);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        dvds.add(dvd1);
        //test
        List<DVD> result = library.putDvds(dvds);
        //assert
        assertEquals(2, result.size());
    }

    @Test
    public void putDVDs_with_four_dvds_and_open_hour() {
        //set
        Library library = new Library();
        library.setHour(3);
        DVD dvd = new DVD("dvd", 120, 0, Movie.ACTION, true);
        DVD dvd1 = new DVD("dvd1", 121, 0, Movie.FUN, true);
        DVD dvd2 = new DVD("dvd2", 122, 0, Movie.MUSICAL, false);
        DVD dvd3 = new DVD("dvd3", 123, 0, Movie.HORROR, false);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        dvds.add(dvd1);
        dvds.add(dvd2);
        dvds.add(dvd3);
        //test
        List<DVD> result = library.putDvds(dvds);
        //assert
        assertEquals(0, result.size());
    }

    @Test
    public void putDvds_with_one_dvd_already_on_library_and_one_double_dvd_input_and_open_hour() {
        //set
        Library library = new Library();
        library.setHour(3);
        DVD dvd = new DVD("dvd", 120, 0, Movie.ACTION, true);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        library.putDvds(dvds);

        DVD dvd2 = new DVD("dvd2", 122, 0, Movie.MUSICAL, false);
        ArrayList<DVD> newDvds = new ArrayList<>();
        newDvds.add(dvd2);
        newDvds.add(dvd);
        //test
        List<DVD> result = library.putDvds(newDvds);
        //assert
        assertEquals(1, result.size());
        DVD dvdActual = result.get(0);
        assertEquals("dvd", dvdActual.getTitle());
    }

    @Test
    public void putDvds_with_two_dvds_and_same_content_and_open_hour() {
        //set
        Library library = new Library();
        library.setHour(3);
        DVD dvd = new DVD("dvd", 120, 0, Movie.ACTION, true);
        DVD dvd1 = new DVD("dvd", 120, 0, Movie.ACTION, true);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        dvds.add(dvd1);
        //test
        List<DVD> result = library.putDvds(dvds);
        //assert
        assertEquals(0, result.size());
    }

    @Test
    public void putDvds_with_two_dvds_and_hour_online() {
        //set
        Library library = new Library();
        library.setHour(10);
        DVD dvd = new DVD("dvd", 120, 0, Movie.ACTION, true);
        DVD dvd1 = new DVD("dvd1", 100, 0, Movie.HORROR, false);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        dvds.add(dvd1);
        //test
        List<DVD> result = library.putDvds(dvds);
        //assert
        assertEquals(0, result.size());
    }
}