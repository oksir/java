import java.io.*;
class New1
{
	public static void main(String args []) throws IOException
	{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		System.out.println("Enter Your name : ");
		String s1=br.readLine();
		System.out.println("Enter your father name");
		String s2=br.readLine();
		System.out.println("\n \t ..................... \n " + "\t Your entered input is: \n\n \t\t\t ");
		System.out.println(" \t\t " +s1);
		System.out.println(" \t\t " +s2);
	}
}