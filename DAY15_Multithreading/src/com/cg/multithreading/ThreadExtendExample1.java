package com.cg.multithreading;

public class ThreadExtendExample1 extends Thread
{
public void run()

{
	System.out.println("thread is going to run");
	
}
     public static void main(String[] args) {
		ThreadExtendExample1 t=new ThreadExtendExample1();
		t.start(); //start method automatically call run method  
	   //  t.start(); // alredy thread is runing so you cannot run again so it will throw exception
       t.run();
        t.run();
        
	}

}
