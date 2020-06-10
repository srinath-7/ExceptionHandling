package com.sri;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Resources {
	
	public static void main(String args[]) {
		
		try(FileReader fr = new FileReader("abc.txt")){	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
