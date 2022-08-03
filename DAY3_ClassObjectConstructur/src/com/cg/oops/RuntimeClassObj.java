package com.cg.oops;
import java.util.Scanner;
class vehicle 
{
 int a;
 void display()
 {
	 System.out.println("welcome to m23 batch");
	 
 }
}
public class RuntimeClassObj{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle obj=new vehicle();

Scanner sc=new Scanner(System.in);
System.out.println("write value of a: ");
obj.a=sc.nextInt();
obj.display();
System.out.println(obj.a);
sc.close();


	}

}



	