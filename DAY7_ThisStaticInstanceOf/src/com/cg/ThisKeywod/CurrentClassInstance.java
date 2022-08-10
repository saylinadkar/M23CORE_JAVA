package com.cg.ThisKeywod;
class main
{
	public int x,y;
	main()
	{
		x=10;
		y=2;
	}
   main get()
	{
		return this;
		
	}
	public void display()
	{
		System.out.println("multiplication of x and y is "+(x*y));
	}
}
public class CurrentClassInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
main m=new main();
m.get().display();

	}

}
