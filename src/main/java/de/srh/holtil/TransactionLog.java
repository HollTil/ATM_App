package de.srh.holtil;

import java.time.DateTimeException;

public class TransactionLog {
    private DateTimeException timestamp;
    private String protocol;
    private TransactionType transactionType;
    private double transactionAmount;
    private String location;
    private String atmID;
    private double postBalance;


//constructor for TransactionLog:
    public void TransactionLog(String protocol, TransactionType transactionType, double transactionAmount, String location, String atmID){
        this.timestamp = timestamp;
        this.protocol = protocol;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.location = location;
        this.atmID = atmID;
        this.postBalance = postBalance;
    }


// Getter:
    public DateTimeException getTimestamp() {
        return timestamp;
    }

    public String getProtocol() {
        return protocol;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public String getLocation() {
        return location;
    }

    public String getAtmID() {
        return atmID;
    }

    public double getPostBalance() {
        return postBalance;
    }
}
