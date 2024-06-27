package com.rakshitha.assignment.utilities;

import java.util.List;
import com.rakshitha.assignment.employees.Employee;


public class Employeeutilities {
	 public static double calculateTotalSalary(List<Employee> employees) {
	        double total = 0;
	        for (Employee e : employees) {
	            total += e.getSalary();
	        }
	        return total;
	    }
	 public static void printEmployeeDetails(List<Employee> employees) {
	        for (Employee e : employees) {
	            System.out.println("Name: " + e.getName() + ", ID: " + e.getEmployeeId() + ", Salary: " + e.getSalary());
	        }
	    }
	}

