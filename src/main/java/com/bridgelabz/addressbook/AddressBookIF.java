package com.bridgelabz.addressbook;

public interface AddressBookIF {
    void operation();
    void addContact();
    void displayContents();
    void editPerson();
    void deletePerson();
    void writeToAddressBookFile();
    com.bridgelabz.addressbook.ArrayList<String> readDataFromFile();
}
