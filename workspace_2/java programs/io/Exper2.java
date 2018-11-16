import java.util.*;
class Exper2
{
	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);

		System.out.print("Enter Your name : \t ");
		String s=S.next();

		System.out.print("Enter a char : ");
		char c=S.next().charAt(0);

		System.out.print(c);
		
		System.out.println("\n Your Entered Name is : \n" +s +" "+c );
	}
}