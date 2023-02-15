package org.example.entity;

import org.example.enums.Gender;
import org.example.enums.Role;

public class  Customer extends User {
    private AccountDetails accountDetails;
    private Long balance;
    private int token;

    public Customer(String name, int age, String email, Role role, Gender gender, AccountDetails accountDetails, Long balance, int token) {
        super(name, age, email, role, gender);
        this.accountDetails = accountDetails;
        this.balance = balance;
        this.token = token;
    }

    public Customer(AccountDetails accountDetails, Long balance, int token) {
        this.accountDetails = accountDetails;
        this.balance = balance;
        this.token = token;
    }

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
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
