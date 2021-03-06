package com.pavel.bank.entity;

public class Account {
    private String IBAN;
    private String nameOfBank;
    private String country;
    private AccountType typeOfAccount;
    private String depositor;
    private long accountID;
    private double amount;
    private float annualProfit;
    private float term;

    public String getIBAN() {
        return IBAN;
    }
    public String getNameOfBank() {
        return nameOfBank;
    }
    public String getCountry() {
        return country;
    }
    public AccountType getTypeOfAccount() {
        return typeOfAccount;
    }
    public String getDepositor() {
        return depositor;
    }
    public long getAccountID() {
        return accountID;
    }
    public double getAmount() {
        return amount;
    }
    public float getAnnualProfit() {
        return annualProfit;
    }
    public float getTerm() {
        return term;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }
    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setTypeOfAccount(AccountType typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }
    public void setDepositor(String depositor) {
        this.depositor = depositor;
    }
    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }
    public void setAmount(double ammount) {
        this.amount = ammount;
    }
    public void setAnnualProfit(float annualProfit) {
        this.annualProfit = annualProfit;
    }
    public void setTerm(float term) {
        this.term = term;
    }


}
