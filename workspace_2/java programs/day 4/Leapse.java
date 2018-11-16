class Leapse
{
	public static void main(String args [])
	{
		int leYear=1500;
		if((leYear%4==0)&&(leYear%400==0)||(leYear%100!=0))
		{
			System.out.println("It's a Leap year: " +leYear);
		}
		else
		{
			System.out.println("This is not a leap year: " +leYear);
		}
	}
}                                                                                  