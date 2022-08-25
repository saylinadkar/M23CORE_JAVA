package com.cg.multithreading;
class A

{
	void print(int num)
	{
		synchronized(this)
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println(num*i);
				try
				{
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
		}	
		
}
class B extends Thread
{
	A obj;
	B(A obj)
	{
		this.obj=obj;
		
	}
	public void run()
	{
		obj.print(50);
	}
	
}
	

public class SynchronisedBlock {

	public static void main(String[] args) {
		A a=new A();
		B t1=new B(a);
		B t2=new B(a);
		t1.start();
		t2.start();
		

	}

}
