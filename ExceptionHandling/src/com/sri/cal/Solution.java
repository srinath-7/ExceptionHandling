package com.sri.cal;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Calculator cal = new Calculator();
		
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number for n: ");
			int n = sc.nextInt();
			System.out.println("Enter the number for p:");
			int p = sc.nextInt();
			System.out.println(cal.longPower(n, p));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
