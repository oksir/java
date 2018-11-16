import java.io.*;
class ArrayNa
{
	public static void main(String[] args) throws IOException
	{
		Console C=System.console();
		
		System.out.print("Enter the number of names to be entered :");
		int A=Integer.parseInt(C.readLine());
		
		String x[]=new String[A]; 
		for(int i=0;i<x.length;i++)
		{
			System.out.print("enter the " +i+"th name :");
			x[i]=C.readLine();
		}
		System.out.println("Your entered names are : ");
		for(String j:x)
			System.out.println(j);

	}
}