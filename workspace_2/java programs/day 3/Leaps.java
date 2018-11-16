class Leaps
{
	public static void main(String args [])
	{
		int lYear=1990;
		if(lYear%4==0)
		{
			if(lYear%100==0)
			{
				if(lYear%400==0)
				{
					System.out.println("leap year: " +lYear);
				}	
				else
				{
					System.out.println("not a leap: " +lYear);
				}
			}
			
			else
			{
				System.out.println("Leap year: " +lYear);
			}		
		}		
		else
		{
			System.out.println("not a leap year: " +lYear);
		}		
		
	}
}