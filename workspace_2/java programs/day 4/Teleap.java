class Teleap
{
	public static void main(String args [])
	{
		int telYear=1990;
		int b=(telYear%4==0)&&(telYear%400==0)||((telYear%100!=0)&&(telYear%4==0))?(29):(28);
		System.out.println(telYear +":This year \" Febraury \" month has " +b +"days");
	}
}