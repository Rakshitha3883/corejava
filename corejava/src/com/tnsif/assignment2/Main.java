package com.tnsif.assignment2;

public class Main {
	public static void main(String[] args) {
		new Student();

        // Creating Commission object
        Comission commission = new Comission();

        // Accepting details of the sales employee
        commission.acceptDetails("Rakshitha", "403 bengaluru", "7406624450", 75000);

        // Calculating and displaying the commission
        commission.displayCommission();
    }

}
