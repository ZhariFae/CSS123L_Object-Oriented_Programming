/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.zhari.mylibs;

/**
 *
 * @author Zhari
 */
public class Address {
    private int number;
    private String city;
    private String country;

    public Address(int number, String city, String country) {
        this.number = number;
        this.city = city;
        this.country = country;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return number + ", " + city + ", " + country;
    }
}
