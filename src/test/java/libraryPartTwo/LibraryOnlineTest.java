package libraryPartTwo;

import junit.framework.Assert;
import libraryPartTwo.model.Book;
import libraryPartTwo.model.CD;
import libraryPartTwo.model.DVD;
import libraryPartTwo.model.Movie;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class LibraryOnlineTest {

    @Test
    public void putBooks_with_two_book_and_open_hour() {
        //set
        LibraryOnline libraryOnline = new LibraryOnline();
        libraryOnline.setHour(10);
        Book book = new Book("title", 100, 0);
        Book bookTwo = new Book("title two", 50, 0);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(bookTwo);

        //test
        List<Book> result = libraryOnline.putBooks(books);

        //assert
        Assert.assertEquals(2, result.size());
        Book bookActual = result.get(0);
        assertEquals(1, bookActual.getShippingDay());
        Book bookOtherActual = result.get(1);
        assertEquals(1, bookOtherActual.getShippingDay());
    }

    @Test
    public void putBook_with_two_book_and_close() {
        //set
        LibraryOnline libraryOnline = new LibraryOnline();
        libraryOnline.setHour(6);
        Book book = new Book("title", 100, 0);
        Book bookTwo = new Book("title two", 50, 0);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(bookTwo);
        //test
        List<Book> result = libraryOnline.putBooks(books);
        //assert
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void putCds_with_two_cds_and_open_hour() {
        //set
        LibraryOnline libraryOnline = new LibraryOnline();
        libraryOnline.setHour(10);
        CD cd = new CD("cd", 120, 0);
        CD cd1 = new CD("cd1", 120, 0);
        ArrayList<CD> cds = new ArrayList<>();
        cds.add(cd);
        cds.add(cd1);
        //test
        List<CD> result = libraryOnline.putCDs(cds);
        //assert
        Assert.assertEquals(2, result.size());
        CD cdActual = result.get(0);
        assertEquals(3, cdActual.getShippingDay());
    }

    @Test
    public void putCds_with_two_cds_and_close() {
        //set
        LibraryOnline libraryOnline = new LibraryOnline();
        libraryOnline.setHour(6);
        CD cd = new CD("cd", 120, 0);
        CD cd1 = new CD("cd1", 120, 0);
        ArrayList<CD> cds = new ArrayList<>();
        cds.add(cd);
        cds.add(cd1);
        //test
        List<CD> result = libraryOnline.putCDs(cds);
        //assert
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void putDvds_with_three_dvds_and_open() {
        //set
        LibraryOnline libraryOnline = new LibraryOnline();
        libraryOnline.setHour(10);
        DVD dvd = new DVD("dvd", 120, 0, Movie.HORROR, false);
        DVD dvd1 = new DVD("dvd1", 121, 0, Movie.FUN, true);
        DVD dvd2 = new DVD("dvd2", 122, 0, Movie.MUSICAL, false);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        dvds.add(dvd1);
        dvds.add(dvd2);
        //test
        List<DVD> result = libraryOnline.putDvds(dvds);
        //assert
        Assert.assertEquals(3, result.size());
        DVD horror = result.get(0);
        assertEquals(1, horror.getShippingDay());
        DVD threeD = result.get(1);
        assertEquals(3, threeD.getShippingDay());
        DVD musical = result.get(2);
        assertEquals(2, musical.getShippingDay());
    }

    @Test
    public void putDvds_with_one_dvd_and_close() {
        //set
        LibraryOnline libraryOnline = new LibraryOnline();
        libraryOnline.setHour(6);
        DVD dvd = new DVD("dvd", 120, 0, Movie.HORROR, false);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        //test
        List<DVD> result = libraryOnline.putDvds(dvds);
        //assert
        Assert.assertEquals(0, result.size());
    }

}