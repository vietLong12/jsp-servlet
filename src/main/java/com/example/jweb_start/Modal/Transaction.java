package com.example.jweb_start.Modal;

import java.time.Instant;

public class Transaction {
    private int id;
    private String cardIdFrom;
    private String cardIdTo;
    private String transactionType;
    private double amount;
    private Instant createdDate;

    public Transaction() {}

    public Transaction(int id, String cardIdFrom, String cardIdTo, String transactionType, double amount, Instant createdDate) {
        this.id = id;
        this.cardIdFrom = cardIdFrom;
        this.cardIdTo = cardIdTo;
        this.transactionType = transactionType;
        this.amount = amount;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardIdFrom() {
        return cardIdFrom;
    }

    public void setCardIdFrom(String cardIdFrom) {
        this.cardIdFrom = cardIdFrom;
    }

    public String getCardIdTo() {
        return cardIdTo;
    }

    public void setCardIdTo(String cardIdTo) {
        this.cardIdTo = cardIdTo;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", cardIdFrom='" + cardIdFrom + '\'' +
                ", cardIdTo='" + cardIdTo + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                ", createdDate=" + createdDate +
                '}';
    }
}
