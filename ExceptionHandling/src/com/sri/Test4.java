package com.sri;

import java.util.ArrayList;
import java.util.Iterator;

public class Test4 {
	
	public static void main(String args[]) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("A");
		l.add("b");
		l.add("c");
		System.out.println(l);
		Iterator itr = l.iterator();
				
		while(itr.hasNext()) {
			//Illegal thread state exception 
//		   Object o = itr.next();
			itr.remove();
		}
		System.out.println(l);
		
	}

}
