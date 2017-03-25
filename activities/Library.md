### Library
A Book has a title and pages.<br/>
A CD has a title and a time.<br/>
A DVD has a kind, a title, an indication of it is in 3D and time.<br/>
There are 4 kind of movie: horror, fun, action, musical.<br/>

The Library must have these methods only:
* ArrayList<Book> putBooks(ArrayList<Book> books);
* ArrayList<DVD> putDvds(ArrayList<DVD> dvds);
* ArrayList<CD> putCDs(ArrayList<CD> cds);
* boolean isOpen(int hour);

The Library can put a lot of books and cds. It's open between 1pm and 7pm.<br/>
The Library can storage 3 DVDs only.<br/>
If there are already 3 DVDs and the user want to give more. The library doesn't accept these dvds.<br/>
If there are already some DVDs and the user try to give a dvd that the library already has. The library doesn't accept these dvds.<br/>

For example:<br/>
The library has 2 DVDs and the user give 4 DVDs. The library doesn't accept it. So the library has 3 DVD.<br/>
The library have 1 DVD like DVD dvd = new DVD("dvd", 120, Movie.HORROR, false) and the user give the same DVD. The library doesn't accept it.<br/>

Implement library and create unit test