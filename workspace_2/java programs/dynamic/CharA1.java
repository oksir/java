import java.io.*;
class CharA1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the array elements : ");
		String S=br.readLine();
		
		System.out.println("Enter the repeated character to be find :");
		char C=(char)br.read();

		char compare,
		char 'a';
		char 'e';
		char 'i';
		int count=0;
		
			for(int j=0;j<(S.length()-1);j++)
			{
				compare=S.charAt(j);
						if((a==C)||(e==C)||(i==C))
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
	