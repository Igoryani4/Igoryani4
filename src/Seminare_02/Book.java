package Seminare_02;

import java.util.ArrayList;

public abstract class Book {
    private String Author;
    private String Title;
    private String Lang;

    public void setAuthor(String author) {
        this.Author = author;
    }
    public String getAuthor() {
        return Author;
    }
    public void setLang(String lang) {
        this.Lang = lang;
    }
    public String getLang() {
        return Lang;
    }
    public void setTitle(String title) {
        this.Title = title;
    }
    public String getTitle() {
        return Title;
    }
    ArrayList<Book> listBook = new ArrayList<>();

    public void addBook(Book book){
        listBook.add(book);

    }

 /*   //public ArrayList<LibraryBooks> getListBook(){
        return listBook;
    }*/

}
