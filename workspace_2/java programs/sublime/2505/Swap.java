class Swap
{
	public static void main(String [] args)
		{
			int a=10;
			int b=20;
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("the value of a and b is : " +a +b + "respectively");
		}
}