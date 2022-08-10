package com.cg.finalkeyword;
class a
{
	a()
	{
		System.out.println("constructor");
	}
	final public void accept()
	{
		System.out.println("parent class");
	}
}
class b extends a
{
	/* public void accept()
	{
		System.out.println("parent class");
	}
	*/
}
public class FinalMethod {

	public static void main(String[] args) {
		b obj=new b();
		obj.accept();

	}

}
