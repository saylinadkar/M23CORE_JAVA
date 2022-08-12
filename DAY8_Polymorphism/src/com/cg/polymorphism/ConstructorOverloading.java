package com.cg.polymorphism;
class Triber
{
	int speed;
	String engine;
	
// 0 parameter 
Triber()
{
	System.out.println("Renault kiger");
}
//2 parameter 
Triber(int speed,String engine)
{
 this.speed=speed;
 this.engine=engine;
 System.out.println("the speed is: "+speed+"km/hr and the engine is on: "+engine);
}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Triber t=new Triber();
	    Triber t1=new Triber(45,"Disel");
	    
		
		}

}
