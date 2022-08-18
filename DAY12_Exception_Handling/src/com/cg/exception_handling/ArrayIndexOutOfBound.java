package com.cg.exception_handling;
		public class ArrayIndexOutOfBound { 
		    public static void main(String[] args){ 
		        System.out.println("First line");
		        System.out.println("Second line");
		        try {
		        int[] myIntArray = new int[]{1, 2, 3};
		        print(myIntArray);
		        }
		        catch(Exception e)
		        {
		        	 System.out.println(e);
		        }
		        System.out.println("Third line");
		    } 
		    public static void print(int[] arr) {
		        System.out.println(arr[3]);
		        System.out.println("Fourth element successfully displayed!");
		    }
		

	
}
