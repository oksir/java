class Inage
{
	public static void main(String args [])
	{
	int aGe=0;
	if(aGe>=1)
	{
		if(aGe>=4)
		{
			if(aGe>=12)
			{
				if(aGe>=18)
				{
					if(aGe>=45)
					{
						if(aGe>=60)
						{
							System.out.println("senior citizen");
						}
						else
						{
							System.out.println("veteren");
						}
					}
					else
					{
						System.out.println("adult");
					}
				}
				else
				{
					System.out.println("teenage");
				}
			}
			else
			{
				System.out.println("child");
			}
		}
		else
		{
			System.out.println("infant");
		}
	}
	else
	{
		System.out.println("enter a valid age");
	}
	}
}
