class Patt2
{
	public static void main(String args [])
	{
		int x=5,p,q;
		for(int i=1;i<=5;i++)
		{
		if(i%2!=0)
		{
			p=0;q=1;
		}
		else
		{
			p=1;q=0;
		}
		for(int j=1;j<=i;j++)
			
			if(j%2==0)
			
				System.out.print(p+" ");
			
			else
			
				System.out.print(q+" ");
				System.out.println();
			
		
		}
	}
}


