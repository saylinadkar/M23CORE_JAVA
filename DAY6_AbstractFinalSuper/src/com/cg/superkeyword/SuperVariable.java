package com.cg.superkeyword;
class color 
{
	protected String name="orange";
	/*protected void display()
	{
		System.out.println("color is "+name);
		
	}*/
	}
class blue extends color 
{
	public String name="blue";
	public  void display()
	{
		System.out.println(name);
		System.out.println(super.name);



}}
public class SuperVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
blue b=new blue();
b.display();
	}

}
