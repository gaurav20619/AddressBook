package com.bridgelabz.addressbook;
import java.util.ArrayList;
import java.util.Iterator;

public class AddressBook {
    ArrayList<ContactPerson> contactList = new ArrayList<ContactPerson>();

    public void addContact(ContactPerson person) {
        contactList.add(person);
    }
    public void displayContents() {

        Iterator<ContactPerson> iterator = contactList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
