package com.reg.oops;

class Student1
{  
 int id;  
 String name;  
}  
public class ObjectRefTwo 
{ 
 public static void main(String args[])
 {  
	  //Creating objects  
	  Student1 s1=new Student1();  
	  Student1 s2=new Student1();  
	  //Initializing objects  
	  s1.id=01;  
	  s1.name="relax";  
	  s2.id=02;  
	  s2.name="buddy";  
	  //Printing data  
	  System.out.println(s1.id+" "+s1.name);  
	  System.out.println(s2.id+" "+s2.name);  
 }  
} 




