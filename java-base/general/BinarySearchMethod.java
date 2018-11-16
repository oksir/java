package com.reg.general;

import java.util.Arrays;

public class BinarySearchMethod 
{
	public static void main(String args[])
	{  
	        int arr[] = {10,20,30,40,50};  
	        int key = 50;  
	        int result = Arrays.binarySearch(arr,key);  
	
	        if (result < 0)
	        {
	            System.out.println("Element is not found!");  
	        }
	        else
	        {	
	            System.out.println("Element is found at index: "+result);  
	        }
	  }  
}  