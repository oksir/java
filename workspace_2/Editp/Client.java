import java.io.*;
class Learn
{
	int i,s;
	//to find a even number
	public void fback() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter any number for finding even/odd : ");
		String S=br.readLine();
		int i=Integer.parseInt(S);
		
		if(i%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}

//finding Leap Year
	public void fback1() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter any number for leap year check : ");
		String S=br.readLine();
		int i=Integer.parseInt(S);

		//System.out.println(i);
		if(((i%4==0)&&(i%400==0))||((i%100!=0)&&(i%4==0)))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}


}

//writing ith table
class Learner
{
	public void future() throws IOException
	{ 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter any number for writing a table : ");
		String S=br.readLine();
		int i=Integer.parseInt(S);
		
		for(int j=i;j<=i;j++)
			for(int k=1;k<=10;k++)
		{
			System.out.println(j+ "*"+ k + "=" + (j*k));

		}
	}
}
//main class
class Client
{
	public static void main(String[] args) throws IOException
	{
		Learn l2=new Learn();
		l2.fback1();
		l2.fback();
		
		Learner l=new Learner();
		l.future();
		
	}
}
