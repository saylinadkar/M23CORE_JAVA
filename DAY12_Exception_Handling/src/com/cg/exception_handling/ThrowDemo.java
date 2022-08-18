package com.cg.exception_handling;

public class ThrowDemo {

	
		//throws we use to declare an exception
		public static void display(int age ,int weight) throws Exception 
		{
			if(age>18 && weight>45) 
			{
				System.out.println("eligible to attend military");
			}
			else 
			{
				//throw is use to throw an exception explicitly
				throw new Exception("not eligible");
			}
		}
		public static void main(String[] args) 
		{
			try 
			{
				display(22,48);
			}
			catch(Exception e) 
			{
				System.out.println(e);
			}
		

	}

}
