import java.io.*;
class new3
{
	public static void main(String args []) throws IOException
	{
		int sum=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter 1st numbers : ");
		String n1=br.readLine();
		int n=Integer.parseInt(n1);

		System.out.println("Enter 2nd no : " );
		String n2=br.readLine();		
		int no=Integer.parseInt(n2);

		sum=n+no;
		
		System.out.println(n+" \t "+no + " \t " + sum);

	}	
}