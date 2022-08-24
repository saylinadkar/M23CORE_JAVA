package com.cg.lamdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Comparator<String>obj=(s1,s2)->Integer.compare(s1.length(),s2.length());
String str[]= {"Sayli","Shrushti","amisha","prathmesh"};
Collections.sort(Arrays.asList(str),obj);
for(String i:str)
{
	System.out.print(i+" ");
	
}
	}

}
