package de.srh.holtil.database;

import de.srh.holtil.Account;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDB {
    //erzeugen der DB Liste
    List<Account> accountList = new ArrayList<>();

    public List<Account> getAccountList() {
        return accountList;
    }
/**
    //neue Accounts in accountList einfügen:
    public InMemoryDB() {
        accountList.add(new Account("Tilles", 1111111111, 1111, 500));
        accountList.add(new Account("JovaNova", 222222222, 2222, 10_000));
        accountList.add(new Account("Dittsche", 333333333, 3333, 55_000));
        accountList.add(new Account("JAYJAY", 444444444, 4444, 500_000));
    }
 **/
}
