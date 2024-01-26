package de.srh.holtil;

public class Account {

//Attributes
    private String customerName;
    private int accountNumber;
    private int pin;
    private double accountValue;
    private boolean state;

    private String tranactionLog;


    public void verifyAcc_number(){
        //TODO: verification if is unique and exact 9 digits
    }
    public void verifyAcc_pin(){
        //TODO: verificate 4 digits
    }

    public Account(String customerName, int accountNumber, int pin, double accountValue) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.accountValue = accountValue;

        this.state = true;
    }

//GETTER

    public String getCustomerName() {
        return customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public double getAccountValue() {
        return accountValue;
    }

    public boolean isState() {
        return state;
    }

    public String getTranactionLog() {
        return tranactionLog;
    }

//SETTER

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setAccountValue(double accountValue) {
        this.accountValue = accountValue;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void setTranactionLog(String tranactionLog) {
        this.tranactionLog = tranactionLog;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customerName='" + customerName + '\'' +
                ", accountNumber=" + accountNumber +
                ", pin=" + pin +
                ", accountValue=" + accountValue +
                ", state=" + state +
                ", tranactionLog='" + tranactionLog + '\'' +
                '}';
    }
}
