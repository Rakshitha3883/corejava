package com.rakshitha.assignment;

import java.util.ArrayList;
import java.util.List;

import com.rakshitha.assignment.employees.Developer;
import com.rakshitha.assignment.employees.Employee;
import com.rakshitha.assignment.employees.Manager;
import com.rakshitha.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
	public static void main(String[] args) {
		 Manager manager = new Manager("Alice", 101, 90000, "HR");
	        Developer developer = new Developer("Bob", 102, 80000, "Java");

	        List<Employee> employees = new ArrayList<>();
	        employees.add(manager);
	        employees.add(developer);

	        EmployeeUtilities.printEmployeeDetails(employees);
	        double totalSalary = EmployeeUtilities.calculateTotalSalary(employees);
	        System.out.println("Total Salary: " + totalSalary);
	    }
}

	
	
