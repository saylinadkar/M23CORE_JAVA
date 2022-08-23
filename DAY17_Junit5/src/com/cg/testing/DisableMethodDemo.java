package com.cg.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisableMethodDemo {
@Test
	void display()
	
	{
		System.out.println("not disabled method ");
		
	}
@Disabled
@Test
void print()

{
	System.out.println("disabled method ");
	
}

}
