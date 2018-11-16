/*to decide whether the lovers are eligible for the marriage or not*/
class Lover
{
	public static void main(String [] args)			//main class
	{
		int mAge=20;								//male age
		int fAge=19;								//female age
		if(mAge<21)									//male not a major=21 years
		{
			System.out.println("\t" +mAge +"=he is not a major,wait for some more time \n");
			System.out.println("\t The pair is \" NOT ELIGIBLE \" for marriage");
		}
		else
		{
			if(fAge<18)								//female not a major
			{
				System.out.println("\t" +fAge +" =she is not a major,wait for some more time \n");
				System.out.println("\t The pair is \" NOT ELIGIBLE \" for marriage");
			}										//when both are majors
			else
			{
				System.out.println("\t lHurray!! \n");		
				System.out.println("\t" +mAge + " and "+ fAge +"=They are \" ELIGIBLE \" for marriage");
			}
		}
	}
}