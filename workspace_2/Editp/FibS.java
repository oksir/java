class FibS
{
	public static void main(String args [])
	{	
		int first=0,second=1,third=0;
		int x=0;

		System.out.print(first +"\t"+second+"\t");
		while(x<=5)
		{
					
			third=first+second;
			first=second;
			second=third;
			System.out.print(third+"\t");
		x++;	
		}
	}
}
