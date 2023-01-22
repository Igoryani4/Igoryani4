package Seminare_02;

import java.util.ArrayList;

class LibraryBooks{
    public String boobAuthor;
    public String bookTitle;
    public String bookLang;
}

public class Library extends Book {
    public String libraryName;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }


    ArrayList<LibraryBooks> listBook = new ArrayList<>();

    public void addBook(String Author, String Title, String Lang){
        LibraryBooks lb = new LibraryBooks();
        setAuthor(Author);
        setTitle(Title);
        setLang(Lang);
        lb.boobAuthor = getAuthor();
        lb.bookLang = getLang();
        lb.bookTitle = getTitle();
        listBook.add(lb);

    }

    public ArrayList<LibraryBooks> getListBook(){
        return listBook;
    }
}
