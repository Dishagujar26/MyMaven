package com.disha.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
     private String name;
     private int roll;
     
	public Student() {
		System.out.println("Creating Student Bean...");
	}

	@Value("Disha Gujar")
	public void setName(String name) {
		this.name = name;
	}

	@Value("23")
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
    public void display() {
    	System.out.println("Name is "+name);
    	System.out.println("Roll number is : "+roll);
    }
     
     
}
