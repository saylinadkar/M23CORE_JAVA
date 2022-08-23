package com.cg.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifeCyclelogger 
{
	//It is used to signal that the annotated method should be executed after all 
	//tests in the current test class.
	@AfterAll
	default void TestMethod()

	{
		System.out.println("Test Method");
		
	}
	
	//It is used to signal that the annotated method should be executed 
	//before all tests in the current test class
	@BeforeAll
default void beforeAllTests()

{
	System.out.println("Before all Test");
	
}
   


	
}
