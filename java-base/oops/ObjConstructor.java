package com.reg.oops;

class Employee
{  
   int id;  
   String name;  
   float salary;  

 void insert(int i, String n, float s) 
 {  
   id=i;  
   name=n;  
   salary=s;  
 }  

 void display()
 {
	 System.out.println(id+"	"+name+"	"+salary);
 }  
}  

public class ObjConstructor 
{ 
	public static void main(String[] args) 
	{  
	    Employee e1=new Employee();  
	    Employee e2=new Employee();  
	    Employee e3=new Employee();  
	    System.out.println("Id"+"	"+"Name"+"	"+"Salary");
	    e1.insert(1,"Om",45000);  
	    e2.insert(2,"Namah",25000);  
	    e3.insert(3,"Shivaya",55000);  
	    e1.display();  
	    e2.display();  
	    e3.display();  
	}  
}  
