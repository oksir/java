import java.io.*;
class StringSort
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the STRINGS to be sorted with comma: ");
		String S=br.readLine();
		
		
		String [] parts=S.split(",");
		
		int len=parts.length;
		
		String temp;
		for(int i=0;i<len;i++)
			for(int j=0;j<len;j++)
			{
				int k=(parts[i].compareToIgnoreCase(parts[j]));
				
				if(k<0)
				{
				temp=parts[j];
				parts[j]=parts[i];
				parts[i]=temp;
				}
				
			}
			
		for(String sort:parts)
		{
		System.out.println(sort);
		}
	}
}

		
		