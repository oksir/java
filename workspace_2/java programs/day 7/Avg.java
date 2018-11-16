class Avg
{
	public static void main(String args [])
	{
		int x=1;
		int a=0,b=0,c=0;
		while(x<=10)
		{
			x++;
			a=a+(x++);
			//System.out.println(a);
		}b=a/(--x);
		//c=b;

	System.out.println(b+ " is the avg of " +x+ " numbers");
	}
}