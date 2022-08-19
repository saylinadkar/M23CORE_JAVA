package com.cg.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class fruit
{
	public String name;

	public fruit(String name) {
		super();
		this.name = name;
	}
	}
public class EatTest {

	public static void main(String[] args) {
		List<fruit> obj=new ArrayList<fruit>();
		fruit f=new fruit("Apple");
		obj.add(f);
		obj.add(new fruit("Strawberry"));
		obj.add(new fruit("Mango"));
		Iterator<fruit> i=obj.iterator();
		while(i.hasNext())
		{
			fruit f1=i.next();
			System.out.println(f1.name);
			
		}}

	}

