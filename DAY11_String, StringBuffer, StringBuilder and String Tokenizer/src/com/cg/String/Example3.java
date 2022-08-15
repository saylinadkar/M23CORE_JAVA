package com.cg.String;

public class Example3 {

	public static void main(String[] args) {
	
		String str="sayli";   //using litral 
		String str1="sayli";
		System.out.println(str==str1);
		
		String str2=new String("sayli");   //using keyword
		String str3=new String("sayli");

	
		System.out.println(str==str2);
		System.out.println(str2==str3);
        System.out.println(str2.equals(str3));

        System.out.println(str.concat(str1)); //merge or combine two strings
	}

}
