class Agestruc
{
	public static void main(String [] args)
	{
		int ageGroup=10;
		if(ageGroup>=60)
		{
			System.out.println("senior citizen: " +ageGroup);
		}
		else
		{
			if(ageGroup>=45)
			{
				System.out.println("veteren: " +ageGroup);
			}
			else
			{
				if(ageGroup>=18)
				{
					System.out.println("adult:" +ageGroup);
				}
				else
				{
					if(ageGroup>=12)
					{
						System.out.println("teenage:" +ageGroup);
					}
					else
					{
						//if(ageGroup>=4)
						//{
							System.out.println("child:" +ageGroup);
						//}
						//else
						//{
						//	if(ageGroup>=1)
						//	{
						//		System.out.println("toddler:" +ageGroup);
						//	}
						//	else
						//	{
						//		System.out.println("infant:" +ageGroup);
						//	}
						//}
					}
				}
			}
		}	
	}
}