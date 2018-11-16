import java.io.*;
//import java.util.*;
class StringSort
{
	
	//Scanner sc=new Scanner(System.in);
	String st;
	public void Sort() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//Console br=System.console();
		
		System.out.println("Enter the Strings to be sorted :");
		String st=br.readLine();
		//st=sc.nextLine();
		String s=st.toLowerCase();
		
		String[] parts=s.split(",");
		
		int l=parts.length;
		String temp="";
		
		for(int i=0;i<l;i++)
		for(int j=0;j<l;j++)
		{
			int comp=(parts[i].compareTo(parts[j]));
			
			if(comp<0)
			{
				temp=parts[j];
				parts[j]=parts[i];
				parts[i]=temp;
			}
		}
			for(String k:parts)
			{
			System.out.println(k);
			}
		
	}
}	
	
class StringDemo
{
	public static void main(String[] args) throws IOException
	{
		StringSort test=new StringSort();
			test.Sort();
	}
}

		