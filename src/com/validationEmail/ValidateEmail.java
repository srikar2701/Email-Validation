package com.validationEmail;

import java.util.Scanner;

public class ValidateEmail {
	public static void main(String[] args) {

		String emails[] = new String[5];

		emails[0] = "srikar@gmail.com";
		emails[1] = "adithya@yahoo.com";
		emails[2] = "nikhil@gmail.com";
		emails[3] = "ravi@hotmail.com";
		emails[4] = "raja@rediff.com";

		Scanner sc = new Scanner(System.in);
		int option;
		Boolean flag = false;

		while (true) {
			flag = false;
			System.out.println("Enter Email Id: ");
			String userEmail = sc.next();

			for (String emailid : emails) {
				if (userEmail.matches(emailid)) {
					System.out.println("Welcome back " + userEmail);
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Invalid User!");
				System.out.println("...Please enter a valid email address...");

			}

		}
	}
}
