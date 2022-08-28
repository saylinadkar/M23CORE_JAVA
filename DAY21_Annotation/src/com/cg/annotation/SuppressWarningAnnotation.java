package com.cg.annotation;
class Animal
{
	Animal()
	{
		System.out.println("LION");
	}
//	public void sound() 
//	{
//		System.out.println("Roars");
//	}
}
public class SuppressWarningAnnotation {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Animal a=new Animal();
		//a.sound();
	}

}