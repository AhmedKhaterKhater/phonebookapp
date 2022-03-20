package com.example.phonebook;


import java.util.Comparator;



class NameComparision implements Comparator<Contact>
{
    public int compare(Contact cont1, Contact cont2)
    {
        return cont1.getName().compareTo(cont2.getName());
    }
}