package com.cg.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Custom
{
	//abstract method
	String print() ;
}
class B
{
	@Custom (print="hello")
	public void display() 
	{
		System.out.println("its holiday");
	}
}
public class CustomAnnotation {

	public static void main(String[] args) throws Exception {
		 B b= new B();
		 b.display();
		 Method m=b.getClass().getMethod("display");
		Custom obj=m.getAnnotation(Custom.class);
			System.out.println(obj.print());
			 

	}

}