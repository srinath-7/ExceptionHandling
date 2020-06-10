package com.sri;

//This is the example of the nested try and the catch block
public class Test {
	
	public static void main(String args[]) {
		
		try {
			System.out.println("This is the exception of the outer try block");
			System.out.println(10/0);
			
			try {
				System.out.println("The inner try block");
				System.out.println(10/0);
			}
			catch(NullPointerException e) {
				System.out.println("This is the arithmetic exception");
			}
			finally {
				System.out.println("This is the exist of finally inner block");
			}
			System.out.println("This is the exist of the inner block");
			
		}
		catch(ArithmeticException e) {
			System.out.println("The inner and outer try exceptions are handled");
		}
		finally {
			System.out.println("The outer finally block will be executed");
		}
		System.out.println("This is the exit of all the exception handling");
	}
}
	
     
		
    
	
	
