class Marte
{
	public static void main(String args [])
	{
		int mAge=25;
		int fAge=21;
		int elgMar=(mAge>=21)&&(fAge>=18)?1:0;
		System.out.println(elgMar);
		if(elgMar==1)
		{
			System.out.println("They are \" Eligible \" for marriage : \n "+"mAge = " +mAge+ "\t" +"fAge = "+fAge);
		}
		else
		{
			System.out.println("They are \" NOT Eligible\" for marriage : \n "+"mAge = " +mAge+ "\t" +"fAge = "+fAge);
		}
	}
}