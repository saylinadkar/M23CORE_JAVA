package com.cg.exception_handling;

public class finallydemo {

public static void print(int[] myIntArray) {
        System.out.println(myIntArray[2]);
        System.out.println("Fourth element successfully displayed!");
    }


		@SuppressWarnings("static-access")
		public static void main(String[] args) {
			finallydemo f=new finallydemo();
			System.out.println("first line");
			System.out.println("second line");
		
			try {
				int[] myIntArray=new int[]{1,2,3};
				f. print(myIntArray);
		        System.exit(0);
		      
		        }
		        catch(Exception e)
		        {
		        	System.out.println(e);
		        }
		        //If any statement out of the try and catch block that will be executed
		       
		   
		  
		        finally 
		        {
		        	System.out.println("this is finally");
		        }
		        System.out.println("Third line");
		    }
}