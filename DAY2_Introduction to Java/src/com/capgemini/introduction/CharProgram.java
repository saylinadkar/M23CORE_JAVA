package com.capgemini.introduction;

import java.util.Scanner;

public class CharProgram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
       System.out.println("write the name");
		char a=sc.next().charAt(0);
		System.out.print("the character is:- "+a);
		
	}

}
