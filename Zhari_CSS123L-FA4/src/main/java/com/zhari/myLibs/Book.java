/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zhari.myLibs;

/**
 *
 * @author Zhari
 */
import java.util.Calendar;

public class Book {
    private String author;
    private String title;
    private Date pubdate;
    private Publisher publisher;

    public Book(String author, String title, Date pubdate) {
        this.author = author;
        this.title = title;
        this.pubdate = pubdate;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int checkBookAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int bookYear = pubdate.getYear();
        int age = currentYear - bookYear;
        return age < 3 ? 1 : 0;
    }

    @Override
    public String toString() {
        return author + ", " + title + ". " + publisher.toString() + ". " + pubdate.toString();
    }
}