package org.example;

public class Ebook extends Book{
    private String subject;

    public Ebook(String author, String subject) {
        super(author);
        this.subject = subject;
    }
    public Ebook(String author) {
        super(author);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Sujet: "+ subject);
    }
}
