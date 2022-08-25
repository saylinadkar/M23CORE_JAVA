package com.cg.Streams;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>obj1=Arrays.asList(new  String[] {"shiv","vina","say","nia"});
		obj1.stream().filter((i->i.length()>3)).forEach((i->System.out.print(i+" ")));
	
	
	}

}
