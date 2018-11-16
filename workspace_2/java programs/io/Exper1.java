import java.io.*;
class Exper1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Your favourite Hero Name : \t");
		String S=br.readLine();

		System.out.print("Enter a character : ");
		char C=(char)br.read();

		System.out.println(C +"\n \n \t\t His name is : " +S);
	}
}