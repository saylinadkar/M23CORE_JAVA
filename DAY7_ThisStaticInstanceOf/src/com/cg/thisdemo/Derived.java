package com.cg.thisdemo;

public class Derived extends Base1
{
	Derived(){
		
		System.out.println("default constructor  for derived");
	}
	Derived(int i)
	{
		this();
		System.out.println("parameterized consructor for derived  "+i);
		

	}
}
