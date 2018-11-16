class MaxA
{
	public static void main(String args[])
	{
		int x[]={10,20,30};
		int temp=0,n=x.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//System.out.println(i +" "+j);
				if(x[i]<x[j])
				{
							temp=x[i];
							x[i]=x[j];
							x[j]=temp;
				}
					
			}
		}			
					System.out.println("sorted order is :");
					for(int a:x)
					System.out.println(a);
	}
}

		
		