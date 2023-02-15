package org.example;

import org.example.Utility.UserUtility;
import org.example.entity.AccountDetails;
import org.example.entity.Customer;
import org.example.enums.AccountType;
import org.example.enums.Gender;
import org.example.enums.Role;
import org.example.service.Implementation.CustomerServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        AccountDetails customer1AccountDetails = new AccountDetails("0011223344",
                "Ann Anyanwu", AccountType.SAVINGS);
        Customer customer1 = new Customer("Ann", 30, "stevoo@gmail.com", Role.CASHIER, Gender.MALE,
                customer1AccountDetails, 0, 1234);


        AccountDetails customer2AccountDetails = new AccountDetails("0011223344",
                "Chika John", AccountType.SAVINGS);
        Customer customer2 = new Customer("Chika", 20, "chika@gmail.com", Role.CASHIER, Gender.FEMALE, customer2AccountDetails, 0.00, 1234);

        List<Customer> customerList = new ArrayList<>(Arrays.asList(customer1,customer2));

        CustomerServiceImpl customerService = new CustomerServiceImpl();

        System.out.println(customerService.deposit(customerList, 2000, "Jane", customer1AccountDetails));

        System.out.println(customerService.deposit(customerList, 1500, "Jane", customer1AccountDetails));


        UserUtility userUtility = new UserUtility();
        System.out.println(userUtility.readUser());
    }




}