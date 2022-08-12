package com.cg.interfacedemo;
interface father
{
	void print();
	
}
interface mother
{
	void display();
	
}
class daughter implements father,mother
{
	public void print()
	{
		System.out.println("father loves daughter");
	}
	public void display()
	{
		System.out.println("mother loves daughter");

	}
}
public class MultipleInheritanceInterface {

	public static void main(String[] args) {
		daughter d=new daughter();
		d.print();
		d.display();
		
	
			}

}
