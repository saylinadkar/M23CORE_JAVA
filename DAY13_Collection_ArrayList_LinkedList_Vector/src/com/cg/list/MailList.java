package com.cg.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
class Adress
{
	private int flat_no;
	private String Street;
	private String Area;	
	private String city;
	private String state;
	public Adress(int flat_no, String street, String area, String city, String state) {
		super();
		this.flat_no = flat_no;
		Street = street;
		Area = area;
		this.city= city;
		this.state = state;
	}
	@Override
	public String toString() {
		return String.format("Adress [flat_no=%s, Street=%s, Area=%s, city=%s, state=%s]", flat_no, Street, Area, city,
				state);
	}

	}
	

public class MailList {

	public static void main(String[] args) {
    List<Adress>obj=new LinkedList<>();
obj.add(new Adress(101,"Lane no.1","Airoli","Mumbai","Maharashtra"));
obj.add(new Adress(102,"Lane no.2","Vishratwadi","Pune","Maharashtra"));
Iterator<Adress> i=obj.iterator();
while(i.hasNext())
{
	Adress elem=i.next();
	System.out.println(elem);
	
}


	}

}
