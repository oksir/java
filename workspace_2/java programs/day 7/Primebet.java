class Primebet
{
	public static void main(String args [])
	{
		int low=20,high=50;
		while(low<high)
		{
			boolean check=false;
			
			for(int i=2;i<=low/2;i++)
			{
				if(low%i==0)
				{
					check=true;
					break;
				}
			}
			if(!check)
				System.out.println(low);
			++low;
		}
	}
}