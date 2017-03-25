package libraryPartTwo;

import libraryPartTwo.model.Book;
import libraryPartTwo.model.CD;
import libraryPartTwo.model.DVD;

import java.util.List;


public interface ILibrary {

    List<Book> putBooks(List<Book> books);

    List<DVD> putDvds(List<DVD> dvds);

    List<CD> putCDs(List<CD> cds);
}
