package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write your code here
        String name = null, author = null, city;
        int age;
        Book[] books = new Book[3];
        Library books_in_lib = new Library();
        for (int i = 0; i < books.length; i++) {
            try {
                System.out.println("Enter name: ");
                name = sc.next();
                System.out.println("Enter author: ");
                author = sc.next();
                books[i] = new Book(i, name, author);

                books_in_lib.addBook(books[i]);
            } catch (NullPointerException e) {
                System.out.println("ERROR");
                continue;
            }
        }
        books[2] = null;
        //for (int i = 0; i < books.length; i++) {
        try {
            books_in_lib.printBooks();
        } catch (NullPointerException e) {
            System.out.println("Array is empty");
        }
        // }
    }
}
