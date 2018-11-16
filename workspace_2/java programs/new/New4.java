import java.io.*;
class New4
{
	public static void main(String args []) throws IOException
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	int a,b,c;
	
	System.out.println("Enter value of 'a' : ");
	//String s1=br.readLine();
	
	System.out.println("Enter second number 'b' : ");
	//String s2=br.readLine();

	c=a;
	a=b;
	b=c;

	System.out.println(a +" \t "+b);

}