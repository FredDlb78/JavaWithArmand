package org.example;

import java.util.ListResourceBundle;

public class Book extends LibraryItem implements Loanable{
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String author){
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Auteur: "+ author);
        System.out.println("Titre: "+ getTitle());
        System.out.println("ISBN: "+ getIsbn());
    }

    @Override
    public void loanItem() {
        System.out.println("The book has been loaned.");
    }

    @Override
    public void returnItem() {
        System.out.println("The book has been returned.");
    }
}

