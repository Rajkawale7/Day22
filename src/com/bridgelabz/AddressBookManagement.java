package com.bridgelabz;
import com.bridgelabz.Inputs.*;
public class AddressBookManagement {
	public static void main(String[] args) {
        String fname,lname,address,city,state,zip,phone;
        
        System.out.println("*****Welcome To Address Book*******");
        
        System.out.println("Enter First Name");
        fname=Inputs.getStringValue();
        System.out.println("Enter Last Name");
        lname=Inputs.getStringValue();
        System.out.println("Enter Address");
        address=Inputs.getStringValue();
        System.out.println("Enter City");
        city=Inputs.getStringValue();
        System.out.println("Enter State");
        state=Inputs.getStringValue();
        System.out.println("Enter Zip");
        zip=Inputs.getStringValue();
        System.out.println("Enter phone number");
        phone=Inputs.getStringValue();
    }
}
