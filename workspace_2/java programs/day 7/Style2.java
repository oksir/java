class Style2
{
	public static void main(String args [])
	{
		for(int i=0;i<=5;i++)
		{
			//System.out.print("\t" +i);
			for(int j=1;j<=5;j++)
				System.out.print(j-i);
				System.out.println("\n ........");
		}
	}
}

/*
1	2	3	4	5
0	1	2	3	4
-1	0	1	2	3
-2	-1	0	1	2
-3	-2	-1	0	1
-4	-3	-2	-1	0	
*/