package com.cg.superkeyword;
class A 
{
	public int pin;
	public void display(int pin)
	{
		System.out.println("oin is "+pin);
	}
}
class b extends A
{
	protected int pin;
	public void display(int pin)
	{
		System.out.println("oin is "+pin);
	}
	public void print()
	{
		display(pin);
		{
			display(1234);
			super.display(5678);
		}
	}

}
public class SuperMethod {

	public static void main(String[] args) {
		 b obj=new b();
		obj.print();
		
		

	}

}
