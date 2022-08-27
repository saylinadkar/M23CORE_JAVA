package com.cg.Enums;
public enum Size implements PizzaSize
{
	SMALL,MEDIUM,LARGE,EXTRALARGE;

	@Override
	public void size() {
		System.out.println("Size is: "+this);
		
	
}
}