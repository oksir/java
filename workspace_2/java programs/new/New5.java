class New5
{
	public static void main(String args [])
	{
		int p=0,q=0,row=5;

		for(int i=1;i<=row;i++)
		{
			if(i%2==0)
			{
				p=0;q=1;
			}
			else
			{
				p=1;q=0;
			}
		
		for(int j=1;j<=i;j++)
		{
			if(j%2==0)
			{
				System.out.print(p +" \t "+ q);
			}
			else
			{
				System.out.print(p + " \t "+ q);
			}
		System.out.print("");
		}

		}

	
	}

}