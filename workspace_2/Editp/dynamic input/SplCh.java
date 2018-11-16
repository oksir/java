import java.io.*;
//import java.io.InputStreamReader;

class SplCh {

	public static void main(String[] args) throws IOException 
		{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter a String : ");
		String input=br.readLine();
		
		
		int n=input.length();
		String s1=input.toLowerCase();
		char [] ch= s1.toCharArray();
		
		int count=0;
		for(int i=0;i<n;i++)
		{
			if((ch[i]<97)||(ch[i]>122))
			{
				count++;
				//System.out.println(ch[i]);
				int x=0;
					x=ch[i];
				System.out.println("\n The ASCII Code of  "+ ch[i]+" is "+x);
			}
		}
		System.out.println("\n the total count of Special Characters in the given string : "+"\"" +input+"\"" +" is "+count);
		
		
		
	}

}