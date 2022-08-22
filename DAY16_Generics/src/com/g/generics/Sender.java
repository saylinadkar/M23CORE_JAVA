package com.g.generics;
//generic claass
public class Sender<T>{
	private T messege;
//getter method 
	public T getMessege() {
		return messege;
	}
//setter method 
	public void setMessege(T messege) {
		this.messege = messege;
	}
public void sendmessege()

{
System.out.println("messege type: "+getMessege().getClass());
System.out.println("contect are: "+getMessege());

}}
