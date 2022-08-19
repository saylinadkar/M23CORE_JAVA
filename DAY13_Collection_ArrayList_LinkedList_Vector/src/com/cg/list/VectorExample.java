package com.cg.list;

import java.util.Vector;

public class VectorExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Vector v = new Vector();
        v.add(0, 1);
        v.add(1, 2);
        v.add(2, "Technical");
        v.add(3, "Technology");
        v.add(4, 3);
        System.out.println(v);
		
}
	

}
