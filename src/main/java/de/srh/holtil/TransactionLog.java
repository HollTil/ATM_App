package de.srh.holtil;

import java.util.Date;

public class TransactionLog {
    private Date timestamp;
    private String protocol;
    private TransactionType transactionType;
    private double transactionAmount;
    private String location;
    private String atmID;
    private double postBalance;


//constructor for TransactionLog:
    public TransactionLog(String protocol, TransactionType transactionType, double transactionAmount, String location, String atmID, double postBalance){
        this.timestamp = generateTimestamp();
        this.protocol = protocol;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.location = location;
        this.atmID = atmID;
        this.postBalance = postBalance;
    }

    private Date generateTimestamp(){
        return new Date();
    }

// Getter:
    public Date getTimestamp() {
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

    @Override
    public String toString() {
        return "TransactionLog{" +
                "timestamp=" + timestamp +
                ", protocol='" + protocol + '\'' +
                ", transactionType=" + transactionType +
                ", transactionAmount=" + transactionAmount +
                ", location='" + location + '\'' +
                ", atmID='" + atmID + '\'' +
                ", postBalance=" + postBalance +
                '}';
    }
}
