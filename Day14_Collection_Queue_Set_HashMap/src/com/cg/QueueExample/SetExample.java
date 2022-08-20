package com.cg.QueueExample;

import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Set s=new HashSet();
       //Set s=new LinkedHashSet();  op- [11,null]
		s.add(11);
        s.add(null);
        System.out.println(s);     //op-[null,11]

	}

}
