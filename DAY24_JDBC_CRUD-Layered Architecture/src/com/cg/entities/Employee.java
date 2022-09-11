package com.cg.entities;

public class Employee
{
private int id;
private String name;

///parameterized constructor
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

//default constructor 
public Employee() {
	super();
	
	}

//getter setter method (to get access in another package )
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

//tostring method to return the output 
public String toString() {
	return String.format("Employee [id=%s, name=%s]", id, name);
}

	
}
