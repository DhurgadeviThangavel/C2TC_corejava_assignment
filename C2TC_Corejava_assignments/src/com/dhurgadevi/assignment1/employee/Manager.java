package com.dhurgadevi.assignment1.employee;

public class Manager extends Employee {
	
	
	    private int teamSize;

	    public Manager(String name, int employeeId, double salary, int teamSize) {
	        super(name, employeeId, salary);
	        this.teamSize = teamSize;
	    }

	    public int getTeamSize() {
	        return teamSize;
	    }

	    public void setTeamSize(int teamSize) {
	        this.teamSize = teamSize;
	    }

	    @Override
	    public String getDetails() {
	        return super.getDetails() + ", Team Size: " + teamSize;
	    }
	}



