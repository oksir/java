package com.reg.oops;

class Student2
{  
 int rollno;  
 String name;  

 void insertRecord(int r, String n)
 {  
  rollno=r;  
  name=n;  
 }  
 void displayInformation()
 {
	 System.out.println(rollno+" "+name);
 }  
}  
public class ObjMethod 
{ 
	public static void main(String args[])
	{ 
	  Student2 s1=new Student2();  
	  Student2 s2=new Student2();  
	  s1.insertRecord(01,"common");  
	  s2.insertRecord(02,"man");  
	  s1.displayInformation();  
	  s2.displayInformation();  
	}  
}  