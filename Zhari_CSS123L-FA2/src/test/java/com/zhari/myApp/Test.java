/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zhari.myApp;

/**
 *
 * @author Zhari
 */
import com.zhari.myLibs.Team;
import com.zhari.myLibs.Member;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Team basketball = new Team("Cardinals", 5, 18, 21);

        while (true) {
            System.out.println("Select Team");
            System.out.println("------------------");
            System.out.println("[1] Apply in the Team");
            System.out.println("[2] Show Applicants");
            System.out.println("[3] Exit");
            System.out.println("------------------");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 3) {
                break;
            }

            switch (choice) {
                case 1:
                    if (basketball.isFull()) {
                        System.out.println(basketball.getName() + " team is no longer accepting applicants.");
                        break;
                    }

                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    Member member = new Member(name, age);

                    if (basketball.addMember(member)) {
                        System.out.println("Welcome to the " + basketball.getName() + " team!");
                    } else {
                        System.out.println("Sorry, you are not qualified!");
                    }
                    break;

                case 2:
                    System.out.println("Current number of recruits:");
                    basketball.showMembers();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}