package com.reg.general;
import java.util.*;
public class SmallestNumberCollections
{
	public static int getSmallest(Integer[] a, int total)
	{  
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		int element=list.get(0);  
		return element;  
	}  
	public static void main(String args[])
	{  
		Integer a[]={1,2,5,6,3,2};  
		Integer b[]={44,66,99,77,33,22,55};  
		System.out.println("a's Smallest: "+getSmallest(a,6));  
		System.out.println("b's Smallest: "+getSmallest(b,7));  
	}
}  