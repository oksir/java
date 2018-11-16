import java.io.*;
class CharA
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the array elements : ");
		String S=br.readLine();
		
		System.out.println("Enter the repeated character to be find :");
		char C=(char)br.read();

		char compare;
		int count=0;
		
			for(int i=0;i<(S.length()-1);i++)
			{
				compare=S.charAt(i);
						if(compare==C)
				count++;
			}
			if(count!=0)
			{
			System.out.println("character \" "+ C +" \" got repeated "+ count + " times");
			}
			else
			{
				System.out.println("Your entered Character is not found... !!");
			}
			
	}
}
	