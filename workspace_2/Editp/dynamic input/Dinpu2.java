import java.io.*;
class Dinpu2
{
	public static void main(String [] args) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("Enter First Number : ");
	String S1=br.readLine();
	int x=Integer.parseInt(S1);

	System.out.print("Enter Second Number : ");
	//char y=br.readLine().charAt(0);
	//char y=Character.parseChar(S2);
	String S2=br.readLine();
	int y=Integer.parseInt(S2);

	System.out.println("\n.................................................\n");
	System.out.println("\n Arthmetic operations for by your given input is..");

	System.out.println(" \"Addition\" \t :" + (x+y));
	System.out.println("\"Subtraction \" \t :" +(x-y));
	System.out.println("\"Multiplication\" :" +(x*y));
	System.out.println("\"Modulus\"  \t :" +(x%y));
	System.out.println("\"Division\"  \t :" +(x/y));
	}
}

