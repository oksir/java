import java.io.*;
class Demo2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a String: ");
		String S=br.readLine();

		int l=S.length();
		System.out.println(l);
		
		String[] part=S.split(" ");

		//char[] c=part.toCharArray();
		
			//char[] yes=new char[l];
	int count=0;
		for(String yes:part)
		{
			System.out.println(yes);

			char[] c=yes.toCharArray();
			
			for (char ca:c )
			{
			//System.out.println(ca);
			if((ca>=97)&&(ca<122))
			{
				count++;
				System.out.println(ca);
			}
			
			}
		}
		if(count>0)
		{
			System.out.println(count);
		}	
	
	}
}
