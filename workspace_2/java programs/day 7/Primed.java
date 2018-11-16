class Primed
{
	public static void main(String args [])
	{
		int i=1;
		while(i<=10)
		
		{
			i++;
			if((i%2==0)|(i%3==0)|(i%5==0)|(i%7==0)|(i%11==0))
		{
			System.out.println(" Not a prime" +i);
				
		}

		else
			{
				System.out.println("it's a prime");
			}
		}
			
	}
}
