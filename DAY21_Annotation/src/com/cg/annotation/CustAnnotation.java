package com.cg.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface OwnCustom
{
	int accept();
}
class C
{
	@OwnCustom(accept = 33)
	public void display() 
	{
		System.out.println("i am using custom annotation");
	}
}
public class CustAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException 
	{
		C c1= new C();
	//	c1.display();
		Method m=c1.getClass().getMethod("display");
		OwnCustom obj=m.getAnnotation(OwnCustom.class);
		c1.display();
		System.out.println(obj.accept());
		

	}

}