package com.tnsif.assignment2;

public class Comission {
	private String Name;
    private double Sales_amount;
    public void acceptDetails(String name, String address, String phone, double sales_amount) {
        this.Name = name;
        this.Sales_amount = sales_amount;
    }
    public double calculateCommission() {
        double commission = 0.0;
        if (Sales_amount >= 100000) {
            commission = Sales_amount * 0.10;
        } else if (Sales_amount >= 50000) {
            commission = Sales_amount * 0.05;
        } else if (Sales_amount >= 30000) {
            commission = Sales_amount * 0.03;
        }
        return commission;
    }
    public void displayCommission() {
        double commission = calculateCommission();
        System.out.println("The commission for " + Name + " is: " + commission);
    }
}
