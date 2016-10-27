package com.example.mmartinez.library.model;

/**
 * Created by mmartinez on 27/10/2016.
 */

public class Book {
    private String bookName;
    private String bookDescription;
    private String bookUrl;

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getBookUrl() {
        return bookUrl;
    }

    public void setBookUrl(String bookUrl) {
        this.bookUrl = bookUrl;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                ", bookUrl='" + bookUrl + '\'' +
                '}';
    }
}
