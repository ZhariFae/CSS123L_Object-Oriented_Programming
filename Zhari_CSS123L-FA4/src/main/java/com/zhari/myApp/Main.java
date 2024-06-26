/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zhari.myApp;

/**
 *
 * @author Zhari
 */
import javax.swing.*;
import com.zhari.myLibs.BookForm;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Zhari FA4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.add(new BookForm());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}