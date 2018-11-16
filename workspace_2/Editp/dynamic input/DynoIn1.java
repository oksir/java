import java.io.*;
class DynoIn1
{
	public static void main(String args []) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("enter your name : ");
		String S=br.readLine();


		System.out.print("Enter your gender : ");
		//String s=br.readLine().charAt(0);
		//char c=br.readLine().charAt(0);
		//char C=Character.parseChar(c);
		char c=(char)br.readLine().charAt(0);

		System.out.print("Enter your salary : ");
		String s2=br.readLine();
		float f=Float.parseFloat(s2);

		System.out.print("Enter your mobile no :");
		String s3=br.readLine();
		long l=Long.parseLong(s3);

		System.out.println("\n name : " +S+ " \n gender : " +c+" \n Salary : "+f+"\n mobile no : "+l );
	}
}

