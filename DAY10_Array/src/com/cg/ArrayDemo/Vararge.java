package com.cg.ArrayDemo;

public class Vararge {


		static void print(int a,int b,String ...n) 
		{
			System.out.println(a+" "+b);
		
			for(int i=0;i<n.length;i++) 
			{
				System.out.println(n[i]+",\t");
		
			}
		}
		public static void main(String[] args) {
			//function call
			print(13,65,"pyrhon","java","c++");

		}

	
}
