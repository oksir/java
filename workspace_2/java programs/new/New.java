import java.io.*;
class New
{
	public static void main(String args [])	throws IOException
	{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		System.out.println("Enter any Quote : ");
		String S=br.readLine();
		System.out.println("Your entered quote is : \n\n\n \t\t" +"\"" +S + "\"");
	}
}