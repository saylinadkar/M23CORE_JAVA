package com.cg.multithreading;
import java.lang.Thread; //Thread package
public class ThreadObjectExample2 {

	

		public static void main(String args[])

		{

		Thread t = Thread.currentThread();

		System.out.println("Current Thread :" + t);
        t.setName("void");
        System.out.println("Current Thread :" + t);
		try

		{

		Thread.sleep(1);

		}

		catch (InterruptedException e)

		{

		System.out.println("Main Thread Interrupted");

		}

		}

}
