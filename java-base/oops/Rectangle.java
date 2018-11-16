package com.reg.oops;

class TestRectangle1 
{
 int length;  
 int width;  

 void insert(int l, int w)
 {  
	 length=l;  
	  width=w;  
}  

 void calculateArea()
 {
	 System.out.println(length*width);
 }  
}  

public class Rectangle
{  
 public static void main(String args[])
 {  
	 TestRectangle1 r1=new TestRectangle1();  
	 TestRectangle1 r2=new TestRectangle1();  
	  r1.insert(11,5);  
	  r2.insert(3,15);  
	  r1.calculateArea();  
	  r2.calculateArea();  
 }  
}  