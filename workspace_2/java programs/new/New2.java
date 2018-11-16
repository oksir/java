import java.io.*;
class New2
{
	public static void main(String args []) throws IOException
	{
	 	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 	System.out.println("Enter your 12 digit Aadhaar number... :");
	 	String s=br.readLine();

	 	long l=Long.parseLong(s);

	 	System.out.println("Your AADHAAR NUMBER IS : \n" +"\n\n \t\t \""+l +"\"");
	}
}