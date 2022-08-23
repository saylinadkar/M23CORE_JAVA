package com.cg.testing;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemoFalse
{
	
@Test
	void division()
	{
	System.setProperty("sayli","parth");
	// if assumption is false then printing statement will print 
	//otherwise not 
	Assumptions.assumeFalse("parth".equals(System.getProperty("say")));
System.out.println("When Assumption is false");

	}}


