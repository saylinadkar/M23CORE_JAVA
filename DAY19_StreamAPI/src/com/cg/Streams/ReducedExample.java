package com.cg.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducedExample {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(11,22,33,44);
Optional<Integer>result=obj.stream().reduce((i,j)->i>j?i:j);
if(result.isPresent())
	
	{
		System.out.println("result is: "+result.get());
	}

}}
