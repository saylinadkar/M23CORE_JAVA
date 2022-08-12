package com.cg.StaticKeyword;

public class StaticBlock {
static int num;
static String str;
// static block: if u want initialized the value without using constructor and object creation
//               then use static block and make the variable of class as static 
static 
{
	num=10;
	str="sayli";
	
}

/*StaticBlock()
{
	num=10;
	str="sayli";
	
}*/
	public static void main(String[] args) {
		//StaticBlock s=new StaticBlock();
		//System.out.println(s.num);
		//System.out.println(s.str);
		System.out.println(num);
		System.out.println(str);


		
		
		}

}
