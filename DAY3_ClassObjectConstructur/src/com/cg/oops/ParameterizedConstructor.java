package com.cg.oops;
class pulser
{
	public int speed;
	public String color;
	pulser(int s,String col)
	{
		speed=s;
		color=col;
		
	}
	void show()
	{
		System.out.println("the speed is "+speed+"km/hr"+" and the color is "+color+" color");
		
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		pulser p=new pulser(50,"blue");
		p.show();
}

}
