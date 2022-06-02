package com.example.phonebook;


import java.util.List;

public class Contact {

    private String name;
    private boolean favourites;
    private List<PhoneNumber> phoneNumbers;





    public Contact( String name, boolean favourites, List<PhoneNumber> phoneNumbers) {

        this.name = name;
        this.favourites = favourites;
        this.phoneNumbers = phoneNumbers;
    }

    public Contact(String name, List<PhoneNumber> phoneNumber, boolean b) {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFavourite() {
        return favourites;
    }

    public void setFavourite(boolean favourites) {
        this.favourites = favourites;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }



}
