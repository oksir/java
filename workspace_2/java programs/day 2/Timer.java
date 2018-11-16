/* to write a program on railway timings am or pm */
class Timer
{
	public static void main(String [] args)
	{
		double eTime=24;
		if(eTime<=0)									//if -ve time
		{
			System.out.println("enter a valid time");
		}
		else
		{												
			if(eTime<=12)								//time is 0-12,it's am		
			{
				System.out.println(eTime +"am");
			}
			else 
			{
				if(eTime<=23.59)						//time is 12-24,it's pm
				{
					System.out.println(eTime +"pm");
				}
				else
				{
					if(eTime==24)						//time is 24=0.0,it's am
					{
						System.out.println(eTime +"\n your entered time is 0.0 am");
					}
					else
					{									//time is >24.0,not valid time
						System.out.println("enter a valid time");
						System.out.println("enter the time between 0.0 to 23.59");
					}
				}
			}

		}
	}
}