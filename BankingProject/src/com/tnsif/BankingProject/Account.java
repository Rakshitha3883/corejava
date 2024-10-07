package com.tnsif.BankingProject;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Account  {
    private int accountID;
    private int customerID;
    private String type;
    private double balance;

    // Constructor
    public Account(int accountID, int customerID, String type, double balance) {
        this.accountID = accountID;
        this.customerID = customerID;
        this.type = type;
        this.balance = balance;
    }

    // Getters and Setters
    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", customerID=" + customerID +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }
    @Test
    public void testAccount() {
        Account account = new Account(1, 101, "savings", 50000);
        service.addAccount(account);

        assertEquals(account, service.findAccountById(1));
        assertTrue(service.getAllAccounts().contains(account));
    }
    
}
