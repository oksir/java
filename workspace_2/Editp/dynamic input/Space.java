import java.io.*;
class Space
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a String : ");
		String S=br.readLine();
		int n=S.length();
			
		int count=0;
		char[] ch=S.toCharArray();
		
		for(char c:ch)
		
		//System.out.println(c);
	
		if(c==' ')
		{
		 
		 count++;
		
		}
		System.out.println("the number of spaces in the given string is : "+count);

	}
}