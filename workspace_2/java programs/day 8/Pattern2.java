						/*writing an program to print 1 to 10 tables along with its o/p sum */
class Pattern2
{
	public static void main(String args [])
	{
		int x=0,y=0;
		for(int i=1;i<=10;i++)
		{
			System.out.println("\t\t Let us read " +i+ "th table :" );	//table no
			for(int j=1;j<=10;j++) 									//till which no
			{				
				x=i*j;
				System.out.println(i +"*"+ j +" = " +x);			//0/p.
				y=y+x;
			}
			
			System.out.println("The sum of the o/p of :" +i+ "th Table is :"+y );
			System.out.println("\n ............................. \n");	//After completion of table o/p appers to be..
		}
	}
}
