/*Fibonacci Series*/
class Fibbi
{
	public static void main(String args [])
	{
		int i=0;
		int j=1;
		int k=1;
		int x=0;
		while(x<=5)
		{
			System.out.println(k);
			k=i+j;
			i=j;
			j=k;
			//System.out.println(k);						
			x++;
		}
	}
}