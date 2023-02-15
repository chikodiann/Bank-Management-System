package org.example.service.Implementation;

import org.example.entity.AccountDetails;
import org.example.entity.Customer;
import org.example.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {


    @Override
    public String deposit(List<Customer> customers, double amount, String name, AccountDetails accountDetails) {
       Customer found = null;
        for (int i = 0; i < customers.size(); i++){
            if (customers.get(i).getAccountDetails().getAccountNumber().equals(accountDetails.getAccountNumber())) {
                found = customers.get(i);
            }
        }
        if (found == null) {
            return "Invalid account details. Kindly confirm";
        }
        found.setBalance(found.getBalance()+amount);
        return "Dear " + found.getName() + " you deposited " + amount +
                " and your new account balance is " + found.getBalance();
    }
}
