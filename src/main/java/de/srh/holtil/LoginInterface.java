package de.srh.holtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoginInterface {
    public static void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Account-Nummer angeben:");
        int accountNumber = scanner.nextInt();

        //TODO: accountNumber has 9 digits and exists in userDB:

        if(Account.verifyAcc_number == true){
            System.out.println("Bitte PIN angeben: ");
            int PIN = scanner.nextInt();
            //TODO: PIN has 4 digits and is correct:
            if(verifyAcc_pin = true){
                //TODO: connect to account
            }
        }
        else
        System.out.println("Account-Nummer ist fehlerhaft oder nicht vorhanden");
    }
}
