import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SplCh {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter a String : ");
		String input=br.readLine();
		
		
		int n=input.length();
		String s1=input.toLowerCase();
		char [] ch= s1.toCharArray();
		
		int count=0;
		for(int i=0;i<n;i++)
		{
			if((ch[i]<=97)&&(ch[i]>=122))
			{
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}

}
