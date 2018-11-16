class Yearf
{
	Public static void main(String args [])
	{
		int cYear=2010;
		int cMonth=3;
		if(cMonth==1)
		{
			int days=31;
			System.out.println("No of days in +"cYear"+ january month is: "	+ days);
		}
		if(cMonth==2)
		{
			
			if((cYear%4==0)&&(cYear%400==0))||((cYear%100!=0)&&(cYear%4==0))
			{
				int days=29;
				System.out.println("It is a leap year");
				System.out.println("No of days in +"cYear"+ Febraury month is: "	+ days);
			}
			else
			{
				int days=28;
				System.out.println("it's not a leap year");		
				System.out.println("No of days in +"cYear"+ Febraury month is: "+ days);
			}
		if(cMonth==3)
		{
			int days=31;
			System.out.println("No of days in +"cYear"+ March month is: "	+ days);
		}	
		if(cMonth==4)
		{
			int days=30;
			System.out.println("No of days in +"cYear"+ April month is: "	+ days);
		}
		if(cMonth==5)
		{
			int days=31;
			System.out.println("No of days in +"cYear"+ May month is: "	 + days);
		}
		if(cMonth==6)
		{
			int=30;
			System.out.println("No of days in +"cYear"+ June month is: "	+ days);
		}
		if(cMonth==7)
		{
			int=31;
			System.out.println("No of days in +"cYear"+ July month is: "	+ days); 
		}
		if(cMonth==8)
		{
			int=31;
			System.out.println("No of days in +"cYear"+ August month is: "	+ days); 
		}
		if(cMonth==9)
		{
			int=30;
			System.out.println("No of days in +"cYear"+ September month is: "	+ days); 
		}
		if(cMonth==10)
		{
			int=31;
			System.out.println("No of days in +"cYear"+ October month is: "	+ days); 
		}
		if(cMonth==11)
		{
			int=30;
			System.out.println("No of days in +"cYear"+ November month is: "	+ days); 
		}
		if(cMonth==12)
		{
			int=31;
			System.out.println("No of days in +"cYear"+ December month is: "	+ days); 
		}
	}

	}	
}