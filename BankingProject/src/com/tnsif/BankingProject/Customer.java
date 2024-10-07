package com.tnsif.BankingProject;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Customer {
    private int customerID;
    private String name;
    private String address;
    private String contact;

    // Constructor
    public Customer(int customerID, String name, String address, String contact) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    // Getters and Setters
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
    @Test
    public void testFindCustomerById() {
        bankingService.addCustomer(1, "Aniket", "Pune", "7868678899");
        Customer customer = bankingService.findCustomerById(1);

        assertNotNull(customer, "Customer should be found");
        assertEquals(1, customer.customerId);
        assertEquals("Aniket", customer.name);
    }
}
