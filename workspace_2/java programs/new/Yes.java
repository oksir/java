class Yes
{
	void m1()
	{
		x=10;
		y=20;
		z=x+y;
	}
	void m2()
	{
		x=20;
		y=30;
		z=y-x;
	}
}
class No
{
	public static void main(String args [])
	{
		Yes obj=new yes();
		obj.m1();
	}
}
