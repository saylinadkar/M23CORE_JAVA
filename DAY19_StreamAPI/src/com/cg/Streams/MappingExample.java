package com.cg.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {

	public static void main(String[] args) {
		List<Integer>obj1=Arrays.asList(new  Integer[] {5,20,25,30,40,50});
		obj1.stream().map(i->i*i).forEach((i->System.out.print(i+" ")));
System.out.println();
//stream class collectors just like collection class 
	List<Integer>obj2=obj1.stream().map(i->i*i).collect(Collectors.toList());
	System.out.println(obj2+" ");
	
	}

}
