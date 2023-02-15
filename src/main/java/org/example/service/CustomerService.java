package org.example.service;

import org.example.entity.AccountDetails;
import org.example.entity.Customer;
import org.example.enums.AccountType;

import java.util.List;

public interface CustomerService {
    String deposit(List<Customer> customers, double amount, String name, AccountDetails details);
}
