package org.example;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("Fred");
        myBook.setTitle("Programming");
        myBook.setIsbn("GT56FD");
        myBook.displayInfo();
        myBook.loanItem();

        Ebook myEbook = new Ebook("James", "Test");
        myEbook.setTitle("Testing");
        myEbook.setIsbn("BA78CD");
        myEbook.displayInfo();

        Ebook ebook = new Ebook("Haby");
        ebook.displayInfo();
    }
}