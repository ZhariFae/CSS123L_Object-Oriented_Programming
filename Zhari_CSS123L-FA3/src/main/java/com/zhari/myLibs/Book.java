/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zhari.mylibs;

/**
 *
 * @author Zhari
 */
import java.util.Calendar;

public class Book {
    private String author;
    private String title;
    private Date pubDate;
    private Publisher publisher;

    public Book(String author, String title, Publisher publisher) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int checkBookAge() {
        if (pubDate == null) {
            throw new IllegalStateException("Publication date is not set");
        }
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - pubDate.getYear();
        return age < 3 ? 1 : 0;
    }

    @Override
    public String toString() {
        if (pubDate == null || publisher == null) {
            throw new IllegalStateException("Publication date or publisher is not set");
        }
        String ageStatus = checkBookAge() == 1 ? "New" : "Old";
        return author + ", " + title + ". " + publisher.toString() + ". " + pubDate.toString() + " (" + ageStatus + ")";
    }
}