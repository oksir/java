import java.io.*;
class TesT
{
	public static void main(String[] args) 
	{
		Ad(10,20,30,40);
		Ad();
		Ad(10,30,60,80,50);
	
	}


public static void Ad(int ... a)
{
	int sum=0;
	for(int k:a)
	{
		sum=sum+k;
	}	
	System.out.println(sum);
	
}
}

