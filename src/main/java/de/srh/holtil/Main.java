package de.srh.holtil;

import de.srh.holtil.database.InMemoryDB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

//create test-db:
        InMemoryDB userDB = new InMemoryDB();

//print test-db-entries:
        System.out.println(userDB.getAccountList());

    }
}