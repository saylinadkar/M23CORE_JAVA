package com.cg.exception_handling;
import java.io.IOException;

		public class ThrowsDemo {
			
			static void print(int num) throws IOException, ClassNotFoundException 
			{
				if(num==1) {
					throw new IOException();
				}
				else
				{
					throw new ClassNotFoundException();
				}
			}

			public static void main(String[] args) throws IOException {
				
				try 
				{
					print(1);
				}
			catch (ClassNotFoundException | IOException e)
				{
					System.out.println(e);
				}
				

		

	}

}
