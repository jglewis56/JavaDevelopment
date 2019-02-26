package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setCustomerName(String name)
    {
        this.customerName = name;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(double deposit)
    {
        if(deposit >= 0)
        {
            this.balance += deposit;
            //setBalance((deposit + getBalance()));
        }
        else{
            System.out.println("Invalid Entry");
        }
    }

    public void withdrawlFunds(double withdrawl)
    {
        if(withdrawl <= getBalance())
        {
            setBalance((getBalance() - withdrawl));
        }
        else
        {
            System.out.println("Insufficient funds ");
        }
    }
}
