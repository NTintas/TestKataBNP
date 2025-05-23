package org.example;

import java.util.ArrayList;

public class Library {
    private int booknumb;
    private ArrayList<Book> booklist;

    public Library() {
        booklist = new ArrayList<>();
        System.out.println("Library created");
    }
    public void addBook(Book book){
        booknumb = booknumb + 1;
        booklist.add(book);
        System.out.println("Book added");
    }

    public void displayAllBooks(){
        for (Book book : booklist) {
            System.out.println("Book: " + book.title + " By: " + book.author + " ISBN: " + book.ISBN);
        }
    }

    public Object searchBook(String title){
        for (Book book : booklist){
            if (book.title.equalsIgnoreCase(title)){
                System.out.println("Book: "+ book.title + " by " + book.author + " with ISBN: " + book.ISBN + " found.");
                return book;
            }
        }
        System.out.println("Book is not existent in library.");
        return null;
    }

    public void borrowBook(String title){
        for (Book book : booklist){
            if (book.title.equalsIgnoreCase(title)){
                if (book.isAvailable){
                    book.isAvailable = false;
                    System.out.println(title +" borrowed.");
                } else {
                    System.out.println("The book is not available yet.");
                }
                return;
            }
        }
        System.out.println(title + " is not in library.");
    }
}
