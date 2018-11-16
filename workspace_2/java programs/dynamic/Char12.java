import java.io.*;
class Char12
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the array elements : ");
		String S=br.readLine();
		
		System.out.println("Enter the repeated character to be find :");
		char C=(char)br.read();
	
		for(String a:C)
		{
			System.out.println(a + " ");
		}
	}
}