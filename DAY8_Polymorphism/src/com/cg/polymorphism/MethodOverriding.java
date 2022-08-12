package com.cg.polymorphism;
//program on method overriding 
//one class is not enough 
//create two or more class which content inheritance concept
class multiplication 
{
	void accept(int a,int b)
	{
		System.out.println(a*b);
	}
	
}
class mult extends multiplication
{
void accept(int x,int y)
{
	System.out.println(x+y);
}}
public class MethodOverriding {

	public static void main(String[] args) {
		mult m=new mult();
	    m.accept(5, 6);
		multiplication m1=new multiplication();
		m1.accept(5, 6);
				
			}

}
