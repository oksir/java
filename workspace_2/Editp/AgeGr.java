class AgeGr
{
	public static void main(String args [])
	{
		int ageG=100;
		if(ageG>=60)
		{
			System.out.println("Senior Citizen : " +ageG);
		}
		else
		{
			if(ageG>=45)
			{
				System.out.println("Veteren : " +ageG);
			}
			else
			{
				if(ageG>=18)
				{
					System.out.println("Adult : " +ageG);
				}
				else
				{
					if(ageG>=15)
					{
						System.out.println("Teenage : " +ageG);
					}
					else
					{										
						if(ageG>=5)
						{
							System.out.println("Child : " +ageG);
						}
						else
						{
							if(ageG>1)
							{
								System.out.println("Toddler : " +ageG);
							}
									
							else
							{
							System.out.println("Enter a Valid Age : " +ageG);
							}
						}
					}
				}
			}
		}
	}
}

