package com.cg.SuperDemo;
//child class 
public class Base2 extends Base1
{
	Base2()
	{
		super(); //call to parant class default constractor 
		System.out.println("default constructor for base2");
	}
Base2(int i)
{
	super(i);//call to parant class parameterized constractor 
	System.out.println("parameterized  constructor for base2 "+i);
}

}



	