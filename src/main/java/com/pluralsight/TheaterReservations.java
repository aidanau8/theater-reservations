package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the customer's full name
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

        // Separate first and last names
        int space = fullName.indexOf(" ");
        String firstName = fullName.substring(0, space);
        String lastName = fullName.substring(space + 1).trim();

        // Read and parse the show date
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String dateText = scanner.nextLine().trim();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate showDate = LocalDate.parse(dateText, formatter);

        // Read the number of tickets
        System.out.print("How many tickets would you like? ");
        int tickets = Integer.parseInt(scanner.nextLine().trim());

        // Choose singular or plural
        String ticketWord;

        if (tickets == 1) {
            ticketWord = "ticket";
        } else {
            ticketWord = "tickets";
        }

        // Display the confirmation
        System.out.println(tickets + " " + ticketWord
                + " reserved for " + showDate
                + " under " + lastName + ", " + firstName);

        scanner.close();
    }
}