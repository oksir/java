import java.io.*;
class Neww
{
	public static void main(String args []) throws IOException
	{
		int i=0,j=0,count=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter n value : ");
		String s=br.readLine();
		int k=Integer.parseInt(s);
	System.out.println("your entered no is :" +k);
	
	
	String primeNumbers=" ";
	for (i = 1; i <= k; i++)  	   
	{	 		 		  
		 int counter=0; 		  
		for(j =i; j>=1; j--)
		{
			if(i%j==0)
			{
				counter = counter + 1;
					
			}

				
		}
			if (counter ==2)
			{
				//Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
				
			}
			
		}		
      System.out.println("Prime numbers from 1 to n are :");
      System.out.println(primeNumbers);
		
   }
}
