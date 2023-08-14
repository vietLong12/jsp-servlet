package com.example.jweb_start.Modal;

public class BankAccount {
    private int id;
    private String cardNumber, cardName, balance;

    public BankAccount() {
    }

    public BankAccount(int id, String cardNumber, String cardName, String balance) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Card Number: " + cardNumber + " Card Name: " + cardName + " Balance: " + balance;
    }

}
