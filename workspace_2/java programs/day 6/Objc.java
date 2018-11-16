class Objc
{
	public static void main(String [] args)
	{
		Objc.m2();
		Objc o=new Objc();
		o.m1();
		
	}
	void m1()
	{
		int x=123;
		int y=143;
		System.out.println(x+y);
	}
	static void m2()
	{
		int x=100;
		int y=50;
		System.out.println(x-y);
	}
}