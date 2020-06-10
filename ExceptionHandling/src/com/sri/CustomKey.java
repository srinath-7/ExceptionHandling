package com.sri;

//This program mainly focuses on the throw keyword
public class CustomKey extends RuntimeException{
	
	public static void main(String args[]) {
		throw new CustomKey();
	}

}
