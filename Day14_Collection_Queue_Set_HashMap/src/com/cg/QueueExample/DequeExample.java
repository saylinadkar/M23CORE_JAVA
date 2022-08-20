package com.cg.QueueExample;

import java.util.ArrayDeque;

public class DequeExample {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque a= new ArrayDeque();
a.add("world");
a.add(0);
System.out.println(a);
a.addFirst("hello");
a.addLast(1);
System.out.println(a);
a.removeFirst();
a.removeLast();
System.out.println(a);
System.out.println(a.peek());

	}

}
