class Tax
{
	public static void main(String [] args)
	{
		int income=4000;
		if(income>=500000)
		{
			System.out.println(income);
			//System.out.println("\n your income is more than the specified amount");
			System.out.println("\n \t You doesn't belong to GST slab 1,\n \t next slab tax percent is 25%");
		}	
		else
		{
			System.out.println(income);
			//System.out.println("your income is less than the specified amount");
			System.out.println("\n You belong to GST slab 1,\n Tax percent is 10%");
		}
	}
}
			