package com.cg.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo
{
	
@Test
	void division()
	{
	System.setProperty("sayli","parth");
	// if assumption is true then printing statement will print 
	//otherwise not 
	Assumptions.assumeTrue("parth".equals(System.getProperty("sayli")));
System.out.println("When Assumption is true");

	}}
