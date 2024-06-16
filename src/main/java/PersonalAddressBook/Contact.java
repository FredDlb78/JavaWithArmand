package PersonalAddressBook;

public class Contact {
    private String contactLastName;
    private String contactFirstName;
    private String contactEmail;
    private String contactPhoneNumber;

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }
    public void setContact(String lastName, String firstName, String email, String phoneNumber){
        setContactLastName(lastName);
        setContactFirstName(firstName);
        setContactEmail(email);
        setContactPhoneNumber(phoneNumber);
    }

    public void displayInfos() {
        System.out.println("Last Name : " + getContactLastName());
        System.out.println("First Name : " + getContactFirstName());
        System.out.println("Email : " + getContactEmail());
        System.out.println("Phone : " + getContactPhoneNumber());
    }
}

