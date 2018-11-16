package com.reg.oops;

class Student
{  
 int id;  
 String name;  
}  
public class ObjectReference 
{  
 public static void main(String args[])
 {  
	  Student s1=new Student();  
	  s1.id=01;  
	  s1.name="Relax";  
	  System.out.println(s1.id+" "+s1.name);//printing members with a white space  
 }  
}  