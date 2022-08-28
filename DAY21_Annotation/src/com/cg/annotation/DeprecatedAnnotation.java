package com.cg.annotation;

class A
{
	//it will just allows any element no longer to the use.
	@Deprecated
	public void print() 
	{
		System.out.println("hello guys");
	}
}
public class DeprecatedAnnotation {

	public static void main(String[] args) {
		A a=new A();
		a.print();
		

	}

}