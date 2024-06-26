/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zhari.myapp;

/**
 *
 * @author Zhari
 */
import java.util.Scanner;

public class ZhariFA1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] basketballTeam = new String[2];
        int basketballCount = 0;

        String[] volleyballTeam = new String[3];
        int volleyballCount = 0;

        boolean firstRun = true;

        while (true) {
            if (!firstRun) {
                System.out.print("Do you want to register again? (Yes/No): ");
                String registerAgain = scanner.nextLine().toLowerCase();

                if (!registerAgain.equals("yes")) {
                    break;
                }
            }
            
            firstRun = false;

            displayMenu();
            int choice = getUserChoice(scanner);

            if (choice == 3) {
                break;
            }

            String name = getName(scanner);
            int age = getAge(scanner);

            switch (choice) {
                case 1:
                    processBApplication(name, age, basketballTeam, basketballCount);
                    if (basketballCount < 2 && age >= 18 && age <= 21) {
                        basketballTeam[basketballCount++] = name;
                    }   break;
                case 2:
                    processVApplication(name, age, volleyballTeam, volleyballCount);
                    if (volleyballCount < 3 && age >= 14 && age <= 17) {
                        volleyballTeam[volleyballCount++] = name;
                    }   break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        displaySuccessfulApplicants(basketballTeam, basketballCount, volleyballTeam, volleyballCount);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Select Team");
        System.out.println("------------------");
        System.out.println("[1] Basketball");
        System.out.println("[2] Volleyball");
        System.out.println("[3] Exit");
        System.out.println("------------------");
        System.out.print("Choice: ");
    }

    private static int getUserChoice(Scanner scanner) {
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    private static String getName(Scanner scanner) {
        System.out.print("Enter name: ");
        return scanner.nextLine();
    }

    private static int getAge(Scanner scanner) {
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        return age;
    }

    private static void processBApplication(String name, int age, String[] team, int count) {
        if (count >= 2) {
            System.out.println("Basketball team is no longer accepting applicants.");
        } else if (age >= 18 && age <= 21) {
            System.out.println("Welcome to the Basketball Team!");
        } else {
            System.out.println("Sorry, you are not qualified!");
        }
    }

    // Process Volleyball application
    private static void processVApplication(String name, int age, String[] team, int count) {
        if (count >= 3) {
            System.out.println("Volleyball team is no longer accepting applicants.");
        } else if (age >= 14 && age <= 17) {
            System.out.println("Welcome to the Volleyball Team!");
        } else {
            System.out.println("Sorry, you are not qualified!");
        }
    }

    // Display successful applicants
    private static void displaySuccessfulApplicants(String[] basketballTeam, int basketballCount, String[] volleyballTeam, int volleyballCount) {
        System.out.println("\nSuccessful Applicants:");
        System.out.println("------------------------------");
        System.out.println("Basketball Team:");
        for (int i = 0; i < basketballCount; i++) {
            System.out.println((i + 1) + ". " + basketballTeam[i]);
        }
        System.out.println("------------------------------");
        System.out.println("Volleyball Team:");
        for (int i = 0; i < volleyballCount; i++) {
            System.out.println((i + 1) + ". " + volleyballTeam[i]);
        }
        System.out.println("------------------------------");
    }
}
