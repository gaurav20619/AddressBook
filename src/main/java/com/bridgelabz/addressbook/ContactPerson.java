package com.bridgelabz.addressbook;

public class ContactPerson {
    private String firstName, lastName, email;
    private long phoneNumber;
    private Address address;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {

        return "Person Details:\nFirst Name - "+firstName+"\nLast Name - "+lastName+"\nPhone Number - "+phoneNumber+"\nEmail - "+email+"\nAddress - "+address;

    }

    public Object getKey() {
        return null;
    }

    public void add(ContactPerson contact) {
    }
}
