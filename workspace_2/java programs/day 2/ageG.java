class ageG
{
	public static void main(String [] args)
	{
		int aGroup=40;
		if(aGroup<=3)
		{
			System.out.println("infant");
		}
		else

		{
			if(aGroup<=12)
			{
				System.out.println("child");
			}
			else
			{
				if(aGroup<=19)
				{
					System.out.println("teenage");
				}
				else
				{
					System.out.println("old");
				}	
			}
		}

	}
}