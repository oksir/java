class Wheel
{
	public static void main(String args[])
	{
		int i=50;
		int j=0;
		while(i==50)
		{
			i=i-2;
			System.out.print(i);
			j=++i;
			//i=(i--) + (--i);
			System.out.println("\t" +j);
			
		}
	}
}