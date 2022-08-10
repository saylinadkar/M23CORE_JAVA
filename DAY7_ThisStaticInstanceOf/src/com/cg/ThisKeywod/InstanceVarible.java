package com.cg.ThisKeywod;
//this keyword used to refer current class instance variable 
class A 
{
	int m1,m2;
	
	public void print(int m1,int m2)
	{
	
		this.m1=m1; //left is current class 
		this.m2=m2;
	}
	public void display()
	{
		System.out.println("assition of m1 and m2 "+(m1+m2));
	}
}
public class InstanceVarible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj=new A();
obj.print(10, 20);
obj.display();
	}

}
