/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zhari.myLibs;

/**
 *
 * @author Zhari
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookForm extends JPanel {
    private JTextField bookNameField;
    private JTextField bookAuthorField;
    private JTextField pubDateField;
    private JTextField publisherNameField;
    private JTextField addressNumberField;
    private JTextField cityField;
    private JTextField countryField;

    public BookForm() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JLabel titleLabel = new JLabel("Formative Assessment 4", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 0, 20, 0);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(titleLabel, gbc);
        
        gbc.gridwidth = 1;
        gbc.insets = new Insets(10, 5, 10, 5);
        
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Book Name:"), gbc);
        
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        bookNameField = new JTextField(15);
        add(bookNameField, gbc);
        
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Book Author:"), gbc);
        
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        bookAuthorField = new JTextField(15);
        add(bookAuthorField, gbc);
        
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Pub Date (DD/MM/YYYY):"), gbc);
        
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        pubDateField = new JTextField(15);
        add(pubDateField, gbc);
        
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JLabel("Publisher Name:"), gbc);
        
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        publisherNameField = new JTextField(15);
        add(publisherNameField, gbc);
        
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(new JLabel("Number:"), gbc);
        
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        addressNumberField = new JTextField(15);
        add(addressNumberField, gbc);
        
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 6;
        add(new JLabel("City:"), gbc);
        
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        cityField = new JTextField(15);
        add(cityField, gbc);
        
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 7;
        add(new JLabel("Country:"), gbc);
        
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        countryField = new JTextField(15);
        add(countryField, gbc);
        
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(20, 10, 10, 10);
        JButton submitButton = new JButton("Submit");
        add(submitButton, gbc);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String author = bookAuthorField.getText();
                String title = bookNameField.getText();
                String[] dateParts = pubDateField.getText().split("/");
                int day = Integer.parseInt(dateParts[0]);
                int month = Integer.parseInt(dateParts[1]);
                int year = Integer.parseInt(dateParts[2]);

                String publisherName = publisherNameField.getText();
                int addressNumber = Integer.parseInt(addressNumberField.getText());
                String city = cityField.getText();
                String country = countryField.getText();

                Address address = new Address();
                address.setNumber(addressNumber);
                address.setCity(city);
                address.setCountry(country);

                Publisher publisher = new Publisher(publisherName, address);
                Date pubdate = new Date(day, month, year);
                Book book = new Book(author, title, pubdate);
                book.setPublisher(publisher);

                int ageStatus = book.checkBookAge();
                String ageDescription = (ageStatus == 1) ? "New" : "Old";

                String bookInfo = String.format(
                    "<html><body style='width: 300px; padding: 10px;'>" +
                    "<h2 style='text-align: center;'>Book Information</h2>" +
                    "<p><b>Author:</b> %s</p>" +
                    "<p><b>Title:</b> %s</p>" +
                    "<p><b>Publication Date:</b> %s</p>" +
                    "<p><b>Publisher:</b> %s</p>" +
                    "<p><b>Age Status:</b> %s</p>" +
                    "</body></html>",
                    book.getAuthor(),
                    book.getTitle(),
                    book.getPubdate(),
                    book.getPublisher(),
                    ageDescription
                );

                JOptionPane.showMessageDialog(BookForm.this, bookInfo, "Book Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}