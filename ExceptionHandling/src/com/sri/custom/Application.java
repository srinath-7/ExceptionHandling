package com.sri.custom;

import java.util.Scanner;

//This is the example of the custom exception
public class Application {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the required age:");
		int age = sc.nextInt();
		
		if(age>60){
			throw new TooYoung("You are too young to register for the age ");
		}
		else if(age <= 18){
			throw new TooOld("You are too old to register:");
		}
		else {
			System.out.println("Thanks for the registration");
		}
	}
	
}
