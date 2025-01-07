package com.java.designpatterns.composite;


	import java.util.ArrayList;
	import java.util.List;

	public class Department implements Employee {
	    private String name;
	    private List<Employee> employees = new ArrayList<>();

	    public Department(String name) {
	        this.name = name;
	    }

	    public void add(Employee employee) {
	        employees.add(employee); // Add an employee (leaf or composite).
	    }

	    public void remove(Employee employee) {
	        employees.remove(employee); // Remove an employee.
	    }

	    @Override
	    public void showDetails() {
	        System.out.println("Department: " + name);
	        for (Employee employee : employees) {
	            employee.showDetails(); // Delegate the operation to child employees.
	        }
	    }
	}



