package com.company;

import java.util.Arrays;

public class Library {
    String name;
    String city;
    Book[] books = new Book[3];
    int index = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addBook(Book book) {
        try {
            books[index] = book;
            index++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The library is full");
        }
    }

    public String toString() {
        return name + " " + city;
    }

    public void printBooks() {
        for (int i = 0; i < books.length; i++) {
            try {
                System.out.println(books[i]);
            }catch (NullPointerException e){
                System.out.println("ERROR");
            }
        }
    }
}
