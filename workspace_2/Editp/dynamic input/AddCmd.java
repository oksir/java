class AddCmd
{
	public static void main(String[] a)
	{	
		int temp=0;
		for(int x=0;x<a.length;x++)
		{
			int y=Integer.parseInt(a[x]);
			temp=temp+y;
		}
		System.out.println(temp);
	}
}
