import java.lang.*;
class Str1
{
public static void main(String[] args)
{
	String s=new String("hai how are you ?");
	String[] words=s.split("");
	//System.out.println(token);
	
	for(int i=0;i<words.length;i++)
	{
		int count=0;
		for(int j=(i+1);j<words.length;j++)
		{
			if(words[i]!=null)
			{
			if(words[i].equals(words[j]))
			{
			count++;
			words[j]=null;
			}
			}
		}
		if(words[i]!=null)
			System.out.println(" "+words[i]+" is repeated "+count);
	}
}
}
		
		
	
	