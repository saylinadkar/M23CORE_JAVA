package com.cg.Streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
		//stream can be created with static data 
		Stream<String>obj=Stream.of("parth","sayli","amisha","siddha");
//terminal operation for each 
		obj.forEach((i)->System.out.print(i+" "));
System.out.println(" ");
//stream can be acquired from array or collection 
List<String>obj1=Arrays.asList(new  String[] {"20","30","40","50"});
obj=obj1.stream();
obj.forEach(System.out::println);

}

}
