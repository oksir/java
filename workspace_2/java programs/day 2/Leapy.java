/* to write a program,whether the entered year is leap year or not */
class Leapy
{
	public static void main(String [] args)													//main class
	{
		int lYear=1300;																		//enter the year to be tested	
		if(lYear%4!=0)																		//leap year lYear%4=0	
		{
			System.out.println("Entered year is \" NOT \" a leap year,i.e." +lYear);
		}
		else
		{
			if(lYear%400==0)																//every 400 century is a leap year			
			{
				System.out.println("Entered year is a \" LEAP YEAR \" ,i.e." +lYear);
			}
			else
			{
				if(lYear%100==0)															//and 100th year is not a leap year
				{
					System.out.println("Entered year is \" NOT \" a leap year," +lYear);
				}
				else
				{
					if(lYear%4==0)															//remainder is 0=leap year
					{
						System.out.println("Entered Year is a \" LEAP YEAR \"," +lYear);
					}
					else
					{	
						System.out.println("Entered year is \" NOT \" a leap year," +lYear);
					}
				}	
			}
		}
	}
}