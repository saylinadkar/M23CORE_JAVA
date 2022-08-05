package com.cg.scanner;
import java.util.Scanner;
//example of scanner class
public class ScannerClass {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	System.out.println(str);
	
sc.close();
	}

}
