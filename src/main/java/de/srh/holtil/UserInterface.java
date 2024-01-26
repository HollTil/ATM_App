package de.srh.holtil;

import java.util.Scanner;

public class UserInterface {
//TODO: Welcome message; selectable options
    public static void welcome(){
        Scanner scanner = new Scanner(System.in);

        //Welcome message:
        System.out.println("Welcome to your ATM-Account " + get.customerName);
        System.out.println("---   ---   ---   ---   ---   ---   ---   ---");
        //give options to select:
        System.out.println("Please select an option: ");
        System.out.println("Account state ");
        System.out.println("Withdraw");
        System.out.println("Deposit");
        System.out.println("Transfer");
        System.out.println("Print account state");
        System.out.println("Logout");

        scanner = Scanner.nextLine();
    }
}
