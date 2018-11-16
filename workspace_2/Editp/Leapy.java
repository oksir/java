										/*To find Leap year and number of days in feb month*/

class LeapY
{
	public static void main(String args [])
	{
		int fYear=1990;
		if((fYear%4==0)&&(fYear%400==0)||(fYear%100!=0)&&(fYear%4==0))
		{
			System.out.println("\n \t \t The entered Year is : " + fYear + ", which is a leap year and has 29 days");
		}
		else
		{
			System.out.println("\n \t \t The entered Year is : " + fYear + "\t , which is NOT a leap year and has 28 days");
		}
	}
}