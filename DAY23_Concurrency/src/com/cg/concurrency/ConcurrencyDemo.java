package com.cg.concurrency;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ConcurrencyDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws ExecutionException {
		//lamda expession for runable interface (Functional interface)
		Runnable r=()->
		{
			try {
			TimeUnit.MILLISECONDS.sleep(1000);
			System.out.println("Current Time:- "+LocalDateTime.now());
		}
			catch(InterruptedException e)
			{
				System.out.println("exception handled");
			}
			
			};
			ExecutorService obj=Executors.newFixedThreadPool(10);
			obj.execute(r);
            Future<String> res=obj.submit(r,"done");

while(res.isDone()==false)
{
	try {
	System.out.println("The method returns value "+res.get());
	}
	catch(InterruptedException e)
	{
		System.out.println("exception handled");

	}
	try
	{
		Thread.sleep(1000L);
	}
	catch(InterruptedException e)
	{
      e.printStackTrace();
  
	}
}
obj.shutdown();
	}

}
