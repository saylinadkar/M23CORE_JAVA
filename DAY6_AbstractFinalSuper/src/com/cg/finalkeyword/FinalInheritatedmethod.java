package com.cg.finalkeyword;
class car 
{
	String name;
	//final method inheritate but not overide 
	final void print(String name)
	
	{
		System.out.println("my name is "+name);
		}
}
class audi extends car
{
	
}
public class FinalInheritatedmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
audi a=new audi();
a.print("Audi");
	}

}
