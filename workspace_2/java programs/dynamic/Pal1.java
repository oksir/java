import java.io.*;
class Pal1
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean b=false;
		do
		{
			
		System.out.println("Enter a String to be checked");
		String S=br.readLine();
		
		
		
		int l=S.length();
		System.out.println("String size is : " +l);
		String s="";
		for(int i=(l-1);i>=0;i--)
		{
			s=s+S.charAt(i);
		}
		System.out.println(s);
		
		if(s.equalsIgnoreCase(S))
		{
			System.out.println("Enter String is a Palindrome");

		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		b=s.equalsIgnoreCase(S);
		}
		while(!b);
			
		/*
		}while(!b)
		/*do
		{
			if(!s.equalsIgnoreCase(S))
			{
			System.out.println("Palindrome");
			break;
			}
			else
			{	
			continue;
			} */
		
		/*while(!s.equalsIgnoreCase(S))
		{
			System.out.println("Palindrome");
		}	
		
		System.out.println("Not a Palindrome");*/
	}	
}
