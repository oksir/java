class Wheels
{
	public static void main(String args[])
	{
		int i=10;
		while(i<=10)
		{
			i--;
			System.out.println(i);
			i=(--i) + (i--);
			System.out.println(i);
		}
	}
}