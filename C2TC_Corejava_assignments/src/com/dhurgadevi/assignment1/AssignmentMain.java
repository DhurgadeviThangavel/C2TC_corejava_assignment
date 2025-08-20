package com.dhurgadevi.assignment1;

import com.dhurgadevi.assignment1.employee.Developer;
import com.dhurgadevi.assignment1.employee.Manager;
import com.dhurgadevi.assignment1.utilities.EmployeeUtilities;

	public class AssignmentMain {
	    public static void main(String[] args) {
	        
	        // Create Manager object
	        Manager mgr = new Manager("Ravi Kumar", 101, 75000, 10);
	        
	        // Create Developer object
	        Developer dev = new Developer("Anjali Sharma", 102, 60000, "Java");
	        
	        // Print details
	        System.out.println("=== Employee Details Before Raise ===");
	        EmployeeUtilities.printEmployee(mgr);
	        EmployeeUtilities.printEmployee(dev);
	        
	        // Increase salary
	        EmployeeUtilities.increaseSalary(mgr, 10);
	        EmployeeUtilities.increaseSalary(dev, 15);
	        
	        // Print updated details
	        System.out.println("\n=== Employee Details After Raise ===");
	        EmployeeUtilities.printEmployee(mgr);
	        EmployeeUtilities.printEmployee(dev);
	    }
	}



