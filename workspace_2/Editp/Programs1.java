import java.io.*;
class Multi 
{
int i;
	Multi() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Select an Operation to be performed from the following: \n 1.even/odd 2.prime/not 3.Unicode/ASCII Value ");
		String S=br.readLine();
		int op=Integer.parseInt(S);

		System.out.println("Enter an Integer Value");
		String s=br.readLine();
		int i=Integer.parseInt(s);
		
		switch (op)
		{
		case 1:
			{
					//p.Programs("i");
		
				if(i%2==0)
				{
					System.out.println("even no: " +i);
				}
				else
				{
					System.out.println("odd no: " +i);
				}
				break;
			}
		case 2:
			{ 
	
				Multi m2=new Multi(i);
				break;
			}


		case 3:
			{
			//Multi m3=new Multi(i);
			Ascii m3=new Ascii();
						m3.Char(i);
				break;
			}
		default:
			{
					//p.Programs("i");
		
				if(i%2==0)
				{
					System.out.println("even no: " +i);
				}
				else
				{
					System.out.println("odd no: " +i);
				}
			
					
			 
	
						Multi m2=new Multi(i);
				
			
			//Multi m3=new Multi(i);
						Ascii m3=new Ascii();
						m3.Char(i);
				
			}

		
		
		}	
		
				
	
		//Multi m=new Multi();
		
	
	


	} 
	Multi(int i)
	{
		//System.out.println(i);
		boolean b1=true;
		int n=2;
		while(n<=i/2)
		{
			if(i%n==0)
			{
				b1=false;
				break;
			}
			else
			{
				b1=true;
				break;
			
			}
		}i++;
		if(b1)
		{
			System.out.println("Prime :" +(i-1));
		}
		else
		{ 
			System.out.println("Not a prime: " +(i-1));
		}
	}

}
class Ascii
{

	public void Char(int i) 
	{
		//System.out.println(i);
		char ch=(char)i;
		System.out.println("Unicode value/ASCII value is: " +ch);
	}
}














class Programs1 
{
	public static void main(String[] args) throws IOException
	{
		
		//Multi m2=new Multi()
		//int l=0;

		Multi m=new Multi();
		//m.Char(i);
		//Multi m2=new Multi(i);
	}
}

	
