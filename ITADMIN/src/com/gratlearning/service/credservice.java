package com.gratlearning.service;
import java.util.Random;
public class credservice {
public String generateEmailID(String fname,String lname,String dept) {
	return fname+lname+"@"+dept+".yahoo.com";
}
	public String generatepassword() 
	{
		String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^";
		Random random=new Random();
		char[] password=new char[8];
		int i;
		
		for(i=0;i<8;i++) {
			password[i]=passwordset.charAt (random.nextInt(passwordset.length()));
	
		}
		return new String(password);
						
}
	
}
