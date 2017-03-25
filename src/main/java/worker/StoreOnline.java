package worker;


import libraryPartTwo.ILibrary;
import libraryPartTwo.Library;
import libraryPartTwo.LibraryOnline;

public class StoreOnline {

    private Worker worker;

    public void work(int hour){
        ILibrary library;
        if(hour < 1 && hour > 7){
            library = new LibraryOnline();
        }else{
            library = new Library();
        }
        worker.storeBook(library);
    }
}
