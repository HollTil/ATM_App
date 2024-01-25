package de.srh.holtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoginInterface {
    public static void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Account-Nummer angeben:");
        int accountNumber = scanner.nextInt();

        System.out.println("Bitte PIN angeben: ");
        int PIN = scanner.nextInt();
    }
}
