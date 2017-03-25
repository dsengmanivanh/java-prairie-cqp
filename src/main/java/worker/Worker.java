package worker;


import libraryPartTwo.ILibrary;
import libraryPartTwo.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;

    private int hour;

    public Worker(String name, int hour) {
        this.name = name;
        this.hour = hour;
    }


    public List<Book> storeBook(ILibrary library) {
        Book book = new Book("title", 100, 0);
        Book bookTwo = new Book("title two", 50, 0);
        Book bookThree = new Book("title three", 70, 0);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(bookTwo);
        books.add(bookThree);
        List<Book> result = library.putBooks(books);
        return result;
    }

}
