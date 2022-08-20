package com.cg.QueueExample;

import java.util.HashSet;
import java.util.Set;

public class HashsetExample {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		HashSet s=new HashSet(); // duplicate element print only once 
         s.add("Sayli");
         s.add("Sayli");
         s.add(12.5);
         s.add(23);
         s.add(23);
         System.out.println(s);
         
         
			}

}
