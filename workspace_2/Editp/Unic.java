import java.io.*;
class UniC
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a value");
		String s=br.readLine();
		int i=Integer.parseInt(s);

		char ch=(char)i;
		System.out.println(ch);
	}
}
