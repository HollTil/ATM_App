package de.srh.holtil;

import java.util.ArrayList;

public class Account {

//Attributes
    private String customerName;
    private int accountNumber;
    private String pin;
    private double accountValue;
    private AccountState state;

    private ArrayList<TransactionLog> transactionLog;
    private int loginFailureCounter;


/**    public boolean verifyAcc_number(){
        //verification if account_number has 9 digits
        int length = String.valueOf(accountNumber).length();
        if(length == 9){
            return true;
        }else{
            return false;
        }
    }
    public boolean verifyAcc_pin(){
        //TODO: verification if account_pin has 4 digits
        int pinLength = String.valueOf(accountNumber).length();
        if(pinLength == 4){
            return true;
        }else{
            return false;
        }
    }
**/
//Constructor for Account:
    public Account(String customerName, int accountNumber, String pin) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

//GETTER:
    public String getCustomerName() {
        return customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getAccountValue() {
        return accountValue;
    }

    public AccountState isState() {
        return state;
    }

    public ArrayList<TransactionLog> getTransactionLog() {
        return transactionLog;
    }

    public int getLoginFailureCounter(){
        return loginFailureCounter;
    }

    public void deposit(int depositAmount){
        double newAccountValue = getAccountValue() + depositAmount;
    }

    public void withdraw(int withdrawAmount){
        double newAccountValue = getAccountValue() - withdrawAmount;
    }

    public void updateFailureLoginCounter(){
        if (loginFailureCounter >= 3){
            AccountState.state blocked = AccountState.state.blocked;
            System.out.println("Zu viele fehlerhafte Login versuche - der Account wurde gesperrt.");
            System.out.println("Bitte kontaktieren Sie einen Mitarbeiter.");
        }
    }





//toString method for print DB in console:
    @Override
    public String toString() {
        return "Account{" +
                "customerName='" + customerName + '\'' +
                ", accountNumber=" + accountNumber +
                ", pin=" + pin +
                ", accountValue=" + accountValue +
                ", state=" + state +
                ", tranactionLog='" + transactionLog + '\'' +
                '}';
    }
}
