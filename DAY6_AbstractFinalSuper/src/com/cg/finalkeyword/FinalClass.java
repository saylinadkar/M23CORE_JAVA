package com.cg.finalkeyword;
//if u make class as a final than u can not inherit that final class 
//final class fruit 
class fruit
{
	//u can not use final keyword with constructor 
	
	fruit()
	{
		System.out.println("constructor");
	}
	//if u make method final then that final method can not overide 
	//final public void accept()
	 public void accept()
	{
		System.out.println("parent class");
	}
}
class apple extends fruit
{
	 public void accept()
	{
		System.out.println("parent class");
	}
	
}

public class FinalClass {

	public static void main(String[] args) {
	apple ap=new apple();
	ap.accept();

	}

}
