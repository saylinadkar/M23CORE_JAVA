package com.cg.lamdaexpression;
//to implement runnable interface method 
public class RunnableInterfaceImplementationUsingLamda {

	public static void main(String[] args) 
	{
		//runnable interface 
		/*Runnable R1=new Runnable()
		{
			public void run()
			{
				System.out.println("Runnable interface implementation ");
				
			}
		};
		*/
		Runnable R1=()->
		{
			System.out.println("Runnable interface implementation ");
		};
				
		Thread T=new Thread(R1);
		T.start();
		
		
		
	
		
	}

}
