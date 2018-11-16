import java.io.*;
class Inpu
{
	public static void main(String args []) throws IOException
	{
	InputStreamReader obj=new InputStreamReader();
	BufferedReader br=new BufferedReader();

	System.out.println("Enter a character : ");
	String s=br.read();
	System.out.println("enter a name : ");
	String s2=br.readLine();

	System.out.println(s);
	System.out.println(s2);
	}
}




