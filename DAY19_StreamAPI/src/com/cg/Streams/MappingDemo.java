package com.cg.Streams;

import java.util.Arrays;
import java.util.List;

public class MappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>obj1=Arrays.asList(new  String[] {"shiv","vina","say","nia"});
		obj1.stream().map((i->i.length()>3)).forEach((i->System.out.print(i+" ")));
		System.out.println();
		obj1.stream().map((i->i.length())).forEach((i->System.out.print(i+" ")));
		


	}

}
