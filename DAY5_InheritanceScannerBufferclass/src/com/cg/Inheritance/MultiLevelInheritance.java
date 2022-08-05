package com.cg.Inheritance;
class bike
{
	protected int speed ;
	void display()
	{
		System.out.println("I Like to drive bike ");
		
	}
}
class pulser extends bike 
{
	String color;
	void print()
	{
		System.out.println("speed is :"+speed);
		

	}
}
class pulser125 extends pulser
{
	void accept()
	{
		System.out.println("color is :"+color);
		

	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
	pulser125 pu=new pulser125();
	pu.color="black";
	pu.speed=60;
	pu.display();
	pu.print();
	pu.accept();
	

	}

}
