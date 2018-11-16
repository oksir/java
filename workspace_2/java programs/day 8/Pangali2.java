class Pangali2
{
	public static void main(String args [])
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=(5+i);j++)
			{
					System.out.print("  ");
					//x=j;
			}
			System.out.println("*");
			
			for(int k=0;k<=(5+i);k++)
			
			{
				//System.out.println("");
				System.out.print("  ");
				
			}
			//System.out.print(" ");
			System.out.println(" * ");
			//System.out.println(" ");
			for(int x=0;x<=(5-i);x++)
			{
					System.out.print("  ");
					//x=j;
			}
			System.out.println("*");
			
			for(int y=0;y<=(5-i);y++)
			
			{
				//System.out.println("");
				System.out.print("  ");
				
			}
			//System.out.print(" ");
			System.out.println(" * ");
			//System.out.println(" ");
		
		}
		//System.out.println("");
	}
}
