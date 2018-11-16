						/*writing an program to print 1 to 10 tables */
class Pattern1
{
	public static void main(String args [])
	{
		int x=10,y=20;
		for(int i=1;i<=10;i++)
		{
			System.out.println("let us read " +i+ "th table :" );	//table no
			for(int j=1;j<=10;j++) 									//till which no
			{				
				System.out.println(i +"*"+ j +"\t =" +i*j);			//0/p.
			}
			System.out.println(".............................");	//After completion of table o/p appers to be..
		}
	}
}
