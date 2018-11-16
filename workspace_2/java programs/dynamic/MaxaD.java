import java.io.*;
class MaxaD
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of values in an array : ");
		String s1=br.readLine();
		int x=Integer.parseInt(s1);
		
		System.out.println("Value of which location you want...?? ");
		String s2=br.readLine();
		int y=Integer.parseInt(s2);
		
		System.out.println("Enter the elements in an array : ");
		int a[]=new int[x];
		int temp=0;
		
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<x;j++)
			{
				String s=br.readLine();
				a[j]=Integer.parseInt(s);
			}
		}
		
		
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<x;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			
		}
		System.out.println("Sorted order is : ");
		
		for(int k:a)
		System.out.println(k);
		System.out.println("The third Maximum value of the array is : " +a[2]);
		System.out.println(a[y-1]);
	}
}

		