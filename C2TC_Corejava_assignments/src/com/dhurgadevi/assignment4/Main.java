package com.dhurgadevi.assignment4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input in CSV format
        String[] bookingDetails = sc.nextLine().split(",");
        TicketBooking tb = new TicketBooking(
                bookingDetails[0],
                bookingDetails[1],
                Integer.parseInt(bookingDetails[2])
        );

        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        tb.displayBooking();

        switch (choice) {
            case 1: // Cash
                double amountCash = sc.nextDouble();
                tb.makePayment(amountCash);
                break;

            case 2: // Wallet
                double amountWallet = sc.nextDouble();
                sc.nextLine();
                String walletNo = sc.nextLine();
                tb.makePayment(amountWallet, walletNo);
                break;

            case 3: // Credit card
                String holderName = sc.nextLine();
                double amountCard = sc.nextDouble();
                sc.nextLine();
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                tb.makePayment(holderName, amountCard, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
	
}
