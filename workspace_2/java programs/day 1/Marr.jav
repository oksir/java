class Marr
{
	public static void main(String [] args)
	{
		int manA=25;
		int womA=35;
		if(womA>=manA)
		{
			System.out.println("Women age is greater than man age,not eligible for marriage: " + womA + "\t" + manA);
		}
		else
		{
			if(manA<=21)
			{
				System.out.println("Man is not a major,not eligible for marriage : " +manA);
			}
			else
			{
				if(womA<=18)
				{
					System.out.println("Woman is not a major,Not eligible for marriage : " +womA);
				}
				else
				{
					System.out.println("Woman and Man both are majors,eligible for marriage: " +womA +"\t"+manA);
				}
		}
	}
}