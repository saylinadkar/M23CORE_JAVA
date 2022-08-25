package com.cg.multithreading;
class Thr extends Thread
{
	public void run()
	{
		System.out.println("Thread Interupton");
		
	}

	
}
public class ThreadInteruptionDemo {

	public static void main(String[] args) {
		Thr t=new Thr();
		t.start();
		System.out.println(" is thread interupted "+t.isInterrupted());
		t.interrupt();
		System.out.println(" is thread interupted "+t.isInterrupted());
				

	}

}
