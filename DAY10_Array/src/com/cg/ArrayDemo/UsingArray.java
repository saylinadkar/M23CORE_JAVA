package com.cg.ArrayDemo;


	import java.util.Arrays;

	public class UsingArray {

		static void display(int...a) 
		{
			//Arrays.sort defines array is a class and sort is method which sort the value
			Arrays.sort(a);
			for(int i=0;i<a.length;i++) 
			{
				System.out.print(a[i]+" ");
			}
			
		}
		public static void main(String[] args) {
			display(12,6,88,9,23,56,71);

		}

	
}
