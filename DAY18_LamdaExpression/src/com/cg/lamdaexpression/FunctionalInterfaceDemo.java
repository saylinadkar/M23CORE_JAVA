package com.cg.lamdaexpression;
//functional interface
//@FunctionalInterface 
interface D
{
	String display(String str);
	
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		D obj=(String str)->
		{
			return str;
		};
		System.out.println(obj.display("welcome to lamda expression concept"));
		
	}

}
