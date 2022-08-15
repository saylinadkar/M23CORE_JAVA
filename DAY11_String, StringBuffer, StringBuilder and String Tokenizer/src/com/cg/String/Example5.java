package com.cg.String;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter name");
		String str=new String(sc.nextLine());
        System.out.println(str.length());
        System.out.println(str.charAt(3));
       //there is no negative index (-3) in java  
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(10+20+" hello"+" world"+10+20);
        //if you add numbers before string it will not combine it will perform addition
        //if you merging numbers with '+' operator after string then it will merge 
        

        sc.close();

	}

}
