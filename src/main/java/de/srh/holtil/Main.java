package de.srh.holtil;

import de.srh.holtil.database.InMemoryDB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        InMemoryDB userDB = new InMemoryDB();

        System.out.println(userDB.getAccountList());

    }
}