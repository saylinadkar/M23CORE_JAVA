package com.cg.ArrayDemo;

public class CharaterArray {



		public static void main(String[] args) {
			char arr[]= {'a','1','c','3',' ','?'};
			
			for(int i=0;i<arr.length;i++) 
			{
				if(Character.isDigit(arr[i]))
				{
					System.out.println(arr[i]+" is a digit");
				}
				if(Character.isLetter(arr[i])) 
				{
					System.out.println(arr[i]+" is a letter");

				}
				if(Character.isWhitespace(arr[i])) 
				{
					System.out.println(arr[i]+" is a white space");

				}
			
			}

		}

	}