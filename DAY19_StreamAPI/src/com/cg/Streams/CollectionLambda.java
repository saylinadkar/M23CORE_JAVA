package com.cg.Streams;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambda {

	public static void main(String[] args) {
		Set<Integer> obj=new HashSet<>();
		obj.add(55);
		obj.add(45);
		obj.add(35);
		obj.add(25);
		System.out.println(obj);
		//if i want to extract set value we can go ahead with iterator  while loop 
		//for loop but using stream API-foreach() method we can do it in one line 
 //extracting the values from set 
		obj.forEach(System.out::println);
		


	}

}
