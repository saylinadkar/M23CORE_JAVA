package com.cg.InstanceOfOperator;
class  A
{
	
}
public class ChildInstance extends A{
	

	public static void main(String[] args) {
		ChildInstance c=new ChildInstance();
		// c is the object of parent class "A" because "ChildInstance" calss accecing the "A" class
		// inastance mean object 
		System.out.println(c instanceof A);              // c is object of A 
		System.out.println(c instanceof ChildInstance);  // c is object of ChildInstance 


	}

}
