/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zhari.myapp;

/**
 *
 * @author Zhari
 */

import com.zhari.mylibs.Address;
import com.zhari.mylibs.Book;
import com.zhari.mylibs.Date;
import com.zhari.mylibs.Publisher;

public class Main {
    public static void main(String[] args) {
        // Create the Address objects
        Address address1 = new Address(123, "California", "USA");
        Address address2 = new Address(123, "Georgia", "USA");
        Address address3 = new Address(124, "New York", "USA");

        Publisher publisher1 = new Publisher("Apress");
        publisher1.setAddress(address1);
        Publisher publisher2 = new Publisher("HomeStudy");
        publisher2.setAddress(address2);
        Publisher publisher3 = new Publisher("HomeLib");
        publisher3.setAddress(address3);

        Date pubDate1 = new Date(1, 2, 2015);
        Date pubDate2 = new Date(1, 2, 2023);
        Date pubDate3 = new Date(5, 6, 2021);

        Book book1 = new Book("Clark, Dan", "C# Object-Oriented Programming", publisher1);
        book1.setPubDate(pubDate1);
        Book book2 = new Book("Dy, Ongtengco", "How to Appreciate Diversity", publisher2);
        book2.setPubDate(pubDate2);
        Book book3 = new Book("Chua, Reyes", "The Greatest Experience", publisher3);
        book3.setPubDate(pubDate3);

        Book[] books = {book1, book2, book3};

        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
