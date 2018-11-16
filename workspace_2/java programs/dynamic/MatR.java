class MatR
{
	public static void main(String [] args)
	{
		int y[][]={{10,20,30},{40,50,60}};
		int z[][]={{70,80,90},{100,110,120}};
		
		for(int i=0;i<2;i++)
		{	
			for(int j=0;j<3;j++)
			{
				System.out.print(y[i][j]+z[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		
	}
}
