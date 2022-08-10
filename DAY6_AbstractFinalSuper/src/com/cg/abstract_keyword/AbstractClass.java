package com.cg.abstract_keyword;

abstract class flower 
{
	//abstract method 
	abstract void print();
	//non abstract method 
	void accept()
	{
		System.out.println("demo on abstract class");
		
	}
	
}
class lily extends flower 
{
void print()
{
	System.out.println("i like lily");

}}
public class AbstractClass {

	public static void main(String[] args) {
		// we can not  create object for abstract class 
lily l=new lily();
l.print();
l.accept();
	}

}
