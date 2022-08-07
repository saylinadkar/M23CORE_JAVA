package com.cg.recursion;
import java.util.Scanner;
public class Sum_of_Digits {

	static int sum(int num)
	{
		
	if(num==0)
		return 0;
	else 
		return (num%10)+sum(num/10);
}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int s=sum(num);
		System.out.println(s+" is the sum of all digit of number "+num);
		sc.close();
		
		
}

}
