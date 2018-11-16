import java.io.*;
class Inpu
{
	public static void main(String args []) throws IOException
	{
	InputStreamReader obj=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(obj);

	System.out.println("Enter a character : ");
	//char s=(char)br.read();
	//char c=Character.parseChar(s);
	char s=br.readLine().charAt(0);
	
	System.out.println("enter a name : ");
	String s2=br.readLine();
	
	System.out.println("Mobile no : ");
	String m=br.readLine();
	long l=Long.parseLong(m);
	

	System.out.println(s);
	System.out.println(m);
	}
}




