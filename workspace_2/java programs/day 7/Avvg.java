class Avvg
{
	public static void main(String args [])
	{
		int i=0,sum=0;
		float avg=0;
		while(i<=10)
		{
			sum=sum+i;
			i++;
		}
			System.out.println(sum);
			avg=(sum/10);
			System.out.println(avg);
	}
}