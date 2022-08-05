package com.cg.Inheritance;
class android 
{
	void display()
	{
		System.out.println("android version");
		
	}
}
class kitkat extends android 
{
	void print()
	{
		System.out.println("kitkat");
		
	}

}
class pie extends android 
{
	void print1()
	{
		System.out.println("pie");
		
	}

}
public class HierarchicalInheritance {
public static void main(String args[])
{
	kitkat k=new kitkat();
	pie p=new pie();
	k.display();
	k.print();
	p.print1();
	
			
}
}
