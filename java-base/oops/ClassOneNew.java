									//Java Program to demonstrate having the main method in   
														//another class  
													//Creating Student class.  
	 
package com.reg.oops;

public class ClassOneNew 
{
	int id;  
	String name;  
}  
	//Creating another class TestStudent1 which contains the main method  
	
class TestStudent1
{  
	public static void main(String args[])
	{  
		ClassOneNew s1=new ClassOneNew();  
	  System.out.println(s1.id);  
	  System.out.println(s1.name);  
	 }  
}  
