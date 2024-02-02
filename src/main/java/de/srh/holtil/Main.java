package de.srh.holtil;

public class Main {
    public static void main(String[] args){


        TransactionLog transactionLog = new TransactionLog("text",TransactionType.DEPOSIT,200,"hier","atmID",250);
        System.out.println(transactionLog);

/**
//create test-db:
        InMemoryDB userDB = new InMemoryDB();

//print test-db-entries:
        System.out.println(userDB.getAccountList());
**/
    }
}