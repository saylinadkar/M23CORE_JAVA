package com.cg.lamdaexpression;

interface E
{
	int add(int a,int b); //abtract method
}
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
	/*	E obj=(int a,int b)->
		{
			return a+b;
		};
System.out.println(obj.add(10, 20));
*/
		E obj=(int a,int b)->(a+b);
		System.out.println("addition of a and b is: "+obj.add(10, 20));
			
		
	}

}
