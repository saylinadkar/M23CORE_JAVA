package com.cg.annotation;

class Car
{
	void speed(int s)
	{
		System.out.println(" parent speed is :"+s+ " km/hr");
	}
}
class BMW extends Car
{
	@Override
	void speed(int s)
	{
		System.out.println("child speed is :"+s+ " km/hr");	}
}
public class OverrideAnnotation {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.speed(50);

	}

}