package com.gratlearning.application;
import com.gratlearning.model.employee;
import com.gratlearning.service.credservice;
public class driver {

	public static void main(String[] args) {
		employee e1=new employee(); //default constructor
		credservice cs=new credservice();//constructor
		String generateEmail=" ";
		String generatepassword=" ";
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Please choose the Department");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			generateEmail=cs.generateEmailID(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(), "Technical");
			generatepassword=cs.generatepassword();
			break;
		case 2:
			generateEmail=cs.generateEmailID(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(), "Admin");
			generatepassword=cs.generatepassword();
			break;
		case 3:
			generateEmail=cs.generateEmailID(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(), "Human Resource");
			generatepassword=cs.generatepassword();
			break;
		case 4:
			generateEmail=cs.generateEmailID(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(), "Legal");
			generatepassword=cs.generatepassword();
			break;
			default:
				System.out.println("Please enter valid choice");
		}
		System.out.println("Dear "+e1.getFirstname()+ "your generated credentials are");
		System.out.println("Dear your EmailID is " +generateEmail);
		System.out.println("Dear your password is "+generatepassword);
	}	
				
		
	}
		


