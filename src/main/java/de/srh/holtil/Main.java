package de.srh.holtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        String acc_number = "";
        String acc_pin = "";
        Scanner scanner = new Scanner(System.in);

        //Eingabeaufforderung der Accountdaten:
        System.out.println("Bitte geben Sie ihre Account-Nummer ein: ");
        acc_number = scanner.nextLine();

        System.out.println("Bitte geben Sie Ihren PIN ein: ");
        acc_pin = scanner.nextLine();

        //TODO: Account verification
    }
}