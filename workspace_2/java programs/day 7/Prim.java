class Prim
{
	public static void main(String args [])
	{
		int i=2;
		int n=7;
		boolean b1=true;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				//System.out.println("prime");
				b1=false;
				break;
			}
			else
			{
				b1=true;
				//System.out.println("not prime");
			}
			i++;
		}
		if(b1)
		{
			System.out.println("its prime number");
		}
		else
		{
			System.out.println("its not a prime number ");
		}
	}
}