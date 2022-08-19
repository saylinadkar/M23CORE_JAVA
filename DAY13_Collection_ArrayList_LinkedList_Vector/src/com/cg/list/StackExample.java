package com.cg.list;

import java.util.Stack;

public class StackExample {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack s=new Stack();
s.add(0,1);
s.add(0,"sayali");
s.add(0,2);
System.out.println(s);
s.push(34);
System.out.println(s);
s.pop();
System.out.println(s);

	}

}
