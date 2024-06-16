package PersonalAddressBook;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contact> contacts = buildContactList();
        Contact john = new Contact("Doe", "John", "john.doe@example.com", "1111111111");
        contacts.add(john);
        editContact(contacts, "james.habricot@example.com", "6666666666");
        deleteContact(contacts, "james.habricot@example.com");
        for(Contact contact : contacts){
            System.out.println(contact);
        }
    }
    static void deleteContact(List<Contact> contacts, String email){
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()){
            Contact contact = iterator.next();
            if(contact.getEmail().equals(email)){
            iterator.remove();}
        }
    }
    public static void editContact(List<Contact> contacts, String email, String newPhone){
        for(Contact contact : contacts){
            if(contact.getEmail().equals(email)){
                contact.setPhone(newPhone);
            }
        }
    }
    static List<Contact> buildContactList(){
        List<Contact> contacts = new ArrayList<>();
    contacts.add(new Contact("Delabre", "Fred", "fred.delabre@example.com", "0102030405"));
    contacts.add(new Contact("Drame", "Haby", "haby.drame@example.com", "9876543210"));
    contacts.add(new Contact("Delabre", "Jannah", "jannah.delabre@example.com", "7894561230"));
    contacts.add(new Contact("Drame", "Myrtille", "myrtille.drame@example.com", "0000000000"));
    contacts.add(new Contact("Habricot", "James", "james.habricot@example.com", "01234567890"));
    return contacts;
    }
}