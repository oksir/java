//import java.util.*;
class Yearf
{
	
	public static void main(String args [])
	{
		//Scanner s=new Scanner(System.in);
		//System.out.print("\nEnter year:----->");
		//int cYear=s.nextInt();
		//System.out.print("\nEnter A month:--->");
		//int cMonth=s.nextInt();
		int cYear=2028;
		int cMonth=2;
		if(cMonth==1)
		{
			int days=31;
			System.out.println("No of days in " + cYear+ " Year,january month is: "	+ days);
		}
		if(cMonth==2)
		{
			
			if((cYear%4==0)&&(cYear%400==0)||(cYear%100!=0)&&(cYear%4==0))
			{
				int days=29;
				System.out.println("It is a leap year");
				System.out.println("No of days in " +cYear+ " Year,Febraury month is: "	+ days);
			}
			else
			{
				int days=28;
				System.out.println("it's not a leap year");		
				System.out.println("No of days in " +cYear+ " Year,Febraury month is: "+ days);
			}
		}
		if(cMonth==3)
		{
			int days=31;
			System.out.println("No of days in " +cYear+ " Year,March month is: "	+ days);
		}	
		if(cMonth==4)
		{
			int days=30;
			System.out.println("No of days in " +cYear+ " Year,April month is: "	+ days);
		}
		if(cMonth==5)
		{
			int days=31;
			System.out.println("No of days in " +cYear+ " Year,May month is: "	 + days);
		}
		if(cMonth==6)
		{
			int days=30;
			System.out.println("No of days in " +cYear+ " Year,June month is: " + days);
		}
		if(cMonth==7)
		{
			int days=31;
			System.out.println("No of days in " +cYear+ " Year,July month is: "	+ days); 
		}
		if(cMonth==8)
		{
			int days=31;
			System.out.println("No of days in " +cYear+ " Year,August month is: "	+ days); 
		}
		if(cMonth==9)
		{
			int days=30;
			System.out.println("No of days in " +cYear+ " Year,September month is: "	+ days); 
		}
		if(cMonth==10)
		{
			int days=31;
			System.out.println("No of days in " +cYear+ " Year,October month is: "	+ days); 
		}
		if(cMonth==11)
		{
			int days=30;
			System.out.println("No of days in " +cYear+ "	Year,November month is: "	+ days); 
		}
		if(cMonth==12)
		{
			int days=31;
			System.out.println("No of days in " +cYear+ " Year,December month is: "	+ days); 
		}
		
	else
	{
	}	
}
}