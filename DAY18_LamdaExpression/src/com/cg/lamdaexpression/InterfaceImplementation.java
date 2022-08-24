package com.cg.lamdaexpression;

interface C 

{
	void display();
	//void accept();
	
}
public class InterfaceImplementation {

	public static void main(String[] args) {
		//The target type of this expression must be a functional interface
		C obj=()->
		{
			System.out.println("Functional interface implementation using lamda expression");
		};
		obj.display();
	}

}
