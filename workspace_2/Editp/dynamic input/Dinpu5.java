import java.io.*;
class Dinpu5
{
	public static void main(String [] args) 
	{
		Console C=System.console();
		
		System.out.println("Name plz :");
		String name=C.readLine();

		System.out.println("Gender :");
		Character ch=C.readLine().charAt(0);

		System.out.println(name);
		System.out.println(ch);
	}
}
