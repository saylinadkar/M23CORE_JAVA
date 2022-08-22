package com.g.generics;

public class GenericMethodExample {
public static <E>void printArray(E[] elem)
{
	for(E itr:elem)
		
	{
		System.out.println(itr.getClass().getName());
		System.out.println(itr);
		
	}
}
	public static void main(String[] args) {
		Integer[] arr1= {10,20,30};
		Character[] arr2= {'a','b','c'};
		System.out.println("printing array for integer");
printArray(arr1);
System.out.println("printing array for character ");
printArray(arr2);

			}

}
