class Primes
{
	public static void main(String args [])
	{
		int x=17;
		int i=0;
		while(i<=10)
		{
			if((x%2!=0)|(x%3!=0)|(x%5!=0)|(x%7!=0))
			{
				System.out.println(x);
				System.out.println("it's not a prime no");
			}
			else
			{
				System.out.println(x);
				System.out.println("prime");
			}
		i++;
		}
	}
}