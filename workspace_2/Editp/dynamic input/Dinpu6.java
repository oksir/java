import java.io.*;
class Dinpu6
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
	
		System.out.println("Enter number of array elements :");
		String S=br.readLine();
		int s=Integer.parseInt(S);

		for(int i=0;i<s.Length;i++)
		{
			System.out.println("enter"+i+"th element :" );
			String S2=br.readLine();
			int y=Integer.parseInt(S2);

			//System.out.println(y);
		

		System.out.println("Your Entered Values are:");

		for(int z:y[])
		{
		
			System.out.println(z);
		} 

		}
	}
}
