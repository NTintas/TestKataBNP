package org.example;

public class Book {

    protected String title;
    protected String author;
    protected int ISBN;
    protected Boolean isAvailable = false;

    public Book(String bookTitle, String bookAuthor, int b_ISBN) {
        title = bookTitle;
        author = bookAuthor;
        ISBN = b_ISBN;
        isAvailable = true;

        System.out.println("The book is created.");
    }
}
