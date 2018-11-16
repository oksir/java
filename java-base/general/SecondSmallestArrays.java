package com.reg.general;
import java.util.*;
public class SecondSmallestArrays 
{
	public static int getSecondSmallest(int[] a, int total)
	{  
		Arrays.sort(a);  
		return a[1];  
	}  
	public static void main(String args[])
	{  
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("a's Second Smallest: "+getSecondSmallest(a,6));  
		System.out.println("b's Second Smallest: "+getSecondSmallest(b,7));  
	}
}  