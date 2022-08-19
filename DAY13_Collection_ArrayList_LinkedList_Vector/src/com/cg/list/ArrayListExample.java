package com.cg.list;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List obj=new ArrayList();
		obj.add(11);
		obj.add("sayli");
		obj.add(25.7);
		obj.add(11);
		System.out.println(obj);
		System.out.println(obj.size());
		obj.remove(2);
		System.out.println(obj);
		System.out.println(obj.indexOf(11));
		System.out.println(obj);
		
		}

}
