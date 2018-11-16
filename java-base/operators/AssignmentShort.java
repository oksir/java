package com.reg.operators;

public class AssignmentShort 
{
	public static void main(String args[])
	{  
		short a=10;  
		short b=10;  
		a+=b;//a=a+b internally so fine  
		//a=a+b;//Compile time error because 10+10=20 now int  
		System.out.println(a);  
	
		short c=10;  
		short d=20;  
		c=(short)(c+d);//20 which is int now converted to short  
		System.out.println(c);  
	}
	
}  

