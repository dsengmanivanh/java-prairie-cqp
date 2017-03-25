package worker;


import libraryPartTwo.ILibrary;
import libraryPartTwo.Library;
import libraryPartTwo.LibraryOnline;
import libraryPartTwo.model.Book;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

public class WorkerTest {

    @Test
    public void storeBook_with_three_books() {
        //set
        Worker worker = new Worker("name", 6);
        ILibrary library = new Library();
        //test
        List<Book> result = worker.storeBook(library);
        //assert
        assertEquals(3, result.size());
    }


    @Test
    public void storeBook_with_three_books_online() {
        //set
        Worker worker = new Worker("name", 10);
        ILibrary library = new LibraryOnline();
        //test
        List<Book> result = worker.storeBook(library);
        //assert
        assertEquals(3, result.size());
    }

}