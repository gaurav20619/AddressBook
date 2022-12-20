package com.bridgelabz.addressbook;

public interface AddressBookDirectoryIF {
    public  void addAddressBook();
    public void operationDirectory();
    public void displayDirectoryContents();
    public void editAddressBook();
    public void searchByCity();
    public void searchByState();
    public void displayPeopleByRegion(HashMap<String, ArrayList<ContactPerson>> listToDisplay);
}
