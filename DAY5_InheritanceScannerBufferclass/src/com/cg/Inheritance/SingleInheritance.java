package com.cg.Inheritance;
class parent 
{
	protected int rollno;
	void print()
	
	{
		
		System.out.println("Welcome to java class");
	}
}
class child extends parent 
{
	void accept()
	
	{
		System.out.println("roll no is: "+rollno);
		
	}
}
	
public class SingleInheritance {

	public static void main(String[] args) {
	child c=new child();
	c.rollno=12;
	c.accept();
   c.print();
}

}
