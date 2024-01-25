package de.srh.holtil;

public class TEST {
    public static void main(String[] args) {

        Account customer1 = new Account();
        customer1.setCustomerName("Egon");
        customer1.setAccountNumber(123456789);
        customer1.setPin(1234);

        System.out.println("Name: " + customer1.getCustomerName() + ", Accountnummer: " + customer1.getAccountNumber());

    }
}