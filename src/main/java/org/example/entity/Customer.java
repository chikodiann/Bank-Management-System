package org.example.entity;

import org.example.enums.Gender;
import org.example.enums.Role;

public class  Customer extends User {
    private AccountDetails accountDetails;
    private double balance;
    private int token;

    public Customer(String name, int age, String email, Role role, Gender gender, AccountDetails accountDetails, double balance, int token) {
        super(name, age, email, role, gender);
        this.accountDetails = accountDetails;
        this.balance = balance;
        this.token = token;
    }

    public Customer(AccountDetails accountDetails, double balance, int token) {
        this.accountDetails = accountDetails;
        this.balance = balance;
        this.token = token;
    }

    public Customer() {

    }

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "accountDetails=" + accountDetails +
                ", balance=" + balance +
                ", token=" + token +
                '}';
    }
}
