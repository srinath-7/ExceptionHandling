package com.sri;

import java.util.Scanner;

public class Test6 {
	
	public static void main(String args[]) {
		
		
		
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the string:");
			String enteredText = input.nextLine();
		    Integer num = Integer.parseInt(enteredText);
		    System.out.println(num);
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
	}

}
