package com.dhurgadevi.assignment1.utilities;
import com.dhurgadevi.assignment1.employee.*;

public class EmployeeUtilities {
	
	    public static void printEmployee(Employee emp) {
	        System.out.println(emp.getDetails());
	    }

	   
	    public static void increaseSalary(Employee emp, double percentage) {
	        double newSalary = emp.getSalary() + (emp.getSalary() * percentage / 100);
	        emp.setSalary(newSalary);
	    }
	}



