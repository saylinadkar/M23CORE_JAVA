package com.g.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsAdvantage {
@SuppressWarnings("unused")
public static void main(String args[])
{
	List<Integer> obj=new LinkedList<>();
	obj.add(12);
	//type 1 safety
	//obj.add("sayli");
	
	System.out.println(obj);
	//type 2 casting is not required 
	List<Integer> obj2=new ArrayList<>();
	obj2.add(15);
	//type 3 compile time checking 
	//obj2.add("15");
	
	Integer d=obj2.get(0);
	System.out.println(obj2);
	
}
}
