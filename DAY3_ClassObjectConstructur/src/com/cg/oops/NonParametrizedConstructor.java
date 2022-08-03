package com.cg.oops;
class animal
{
	int b;
	animal()
	{
       b=30;
	}
	void display()
	{
		System.out.println("lion "+b);
	}
}
public class NonParametrizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
animal a=new animal();
a.display();
	}

}
