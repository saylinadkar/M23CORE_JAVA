package com.cg.String;

public class StringBufferExample {

	public static void main(String[] args) {
		String s="today";
		StringBuffer sb=new StringBuffer(s.length()); //length=5;
		System.out.println(sb.capacity());   // (s.capacity()) =throw error       
		//capacity is always used with StringBuffer (ex= (sb.capacity())
		// capacity of empty  string is 16
		 StringBuffer sb1=new StringBuffer("Internet Of Things");
		 System.out.println(sb1.capacity()); //18(sb1)+16(empty string)=34
		 sb1=new StringBuffer(" "); //1
		 System.out.println(sb1.capacity());// 1+16=17
		 
		}

}
