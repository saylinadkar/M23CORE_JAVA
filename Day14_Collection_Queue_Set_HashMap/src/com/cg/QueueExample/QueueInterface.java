package com.cg.QueueExample;

import java.util.PriorityQueue;
import java.util.Queue;
//in queue those element inserted first will out first 
public class QueueInterface {

	public static void main(String[] args) {
		Queue<Integer>q=new PriorityQueue<Integer>();
		q.add(11);
		q.add(22);
		q.add(33);
		q.offer(44);   //offer is also used to add elements in queue
		q.offer(50);
		System.out.println(q);
		System.out.println("the head element is : "+q.peek()); //peek method show the first element in queue
		System.out.println(q.poll()); 
		System.out.println(q);  //poll method remove the first or head element
		//if there is no elements in queue and you used poll method then it will not give the exception 
		//hence always used poll method instead of remove
	   
		
		/*	int i;
		Queue<Integer>q=new PriorityQueue<Integer>();
		for(i=5;i>=0;i--)
		{
			q.add(i);
			
		}
		System.out.println(q);
		*/
	}

}
