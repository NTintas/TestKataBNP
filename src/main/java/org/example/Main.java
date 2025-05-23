package org.example;

//import java.awt.print.Book;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library l = new Library();
        Book b = new Book("Book", "Me", 1234455);
        Book b2 = new Book("book2", "notme", 54321);

        l.addBook(b);
        l.displayAllBooks();
        l.addBook(b2);
        l.displayAllBooks();
        l.searchBook("book2");
        l.borrowBook("book2");
        l.borrowBook("book5");

        System.out.println("is book2 available?" + b2.isAvailable);
    }
}