import java.io.*;
class StrSort
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the STRING : ");
		String S=br.readLine();
		
		String [] token=S.split(" ");
		
		int l=token.length;
		
		int k;
		//String[] temp=new String[l];
		String temp="";
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
		{
		 //token[i]=br.readLine();
		//System.out.println(token[j]);
			k=(token[i].compareTo(token[j]));
				//System.out.println(k);	
				if(k<0)
				{
				temp=token[j];
				token[j]=token[i];
				token[i]=temp;
				
				}
		}
		
		for(String p:token)
		{
			System.out.println(p);
		}
/*
		
		for(int i=0;i<l;i++)
		{	
			for(int j=i;j<l;j++)
			{		
				
			}	
		} */
	
	}	

}