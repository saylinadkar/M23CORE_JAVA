package com.cg.thisdemo;

public abstract class Base1 {
Base1()
{
	this(65);
	System.out.println("default constructor  base1");

}
Base1(int i)
{
	System.out.println("parameterized constructor for base1 "+i);
}
}