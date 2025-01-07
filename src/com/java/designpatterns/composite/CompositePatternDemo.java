package com.java.designpatterns.composite;


	public class CompositePatternDemo {
	    public static void main(String[] args) {
	        // Create individual employees
	        Employee dev1 = new Developer("Alice", "Frontend Developer");
	        Employee dev2 = new Developer("Bob", "Backend Developer");
	        Employee manager1 = new Manager("Carol", "Project Manager");

	        // Create a department and add employees
	        Department engineeringDept = new Department("Engineering");
	        engineeringDept.add(dev1);
	        engineeringDept.add(dev2);

	        // Create another department and add employees
	        Department managementDept = new Department("Management");
	        managementDept.add(manager1);

	        // Create a larger department and add sub-departments
	        Department company = new Department("Company");
	        company.add(engineeringDept);
	        company.add(managementDept);

	        // Display the company structure
	        company.showDetails();
	    }
	}



