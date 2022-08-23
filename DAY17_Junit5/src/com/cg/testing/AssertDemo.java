package com.cg.testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertDemo
{
	@Test
public void display()
{
	int result=5;
	int expected=5; //put expected=8 op=false.
	//it will check the value is equal or not 
	//if it is equal no failuer otherwise u will get failuers in testing 
	assertEquals(result,expected);
	
}
	
}
