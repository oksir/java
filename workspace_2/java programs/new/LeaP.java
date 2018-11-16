class LeaP
{
	public static void main(String [] args)
	{
	 	int x=10;
	 	int y=1991;
	 	int c=((y%4==0)&&(y%400==0)||(y%100!=0)&&(y%4==0)?x:y);

	 	if(c==x)
	 	{
	 	System.out.println(y +" is a Leap Year");
		}
		else
		{
			System.out.println(y +" is not a leap Year");
		}
	}
}