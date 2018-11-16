import java.io.*;
class Demo1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a String: ");
		String S=br.readLine();

		int l=S.length();
		System.out.println(l);
	
		char[] c=S.toCharArray();
		
			//char[] yes=new char[l];
	int count=0;
		for(char yes:c)
		{
		/*	switch (yes)
			{
			case :
			
			}*/
			//System.out.println(yes);
			if((yes>=97)&&(yes<122))
			{
				count++;
				System.out.println(yes);
			}
			
		}
		if(count>0)
		{
			System.out.println(count);
		}

	
	}
}
