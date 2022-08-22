package com.g.generics;

public class GenericsClassExample<T>
{
T num;
public void show() {
	
	System.out.println(num.getClass().getName());
}
	public static void main(String[] args) {
		//instead of collection i used generics class and generic concept
		GenericsClassExample<Double> obj=new GenericsClassExample<>();
		obj.num=13.8;
		obj.show();
		
			}
	

}
