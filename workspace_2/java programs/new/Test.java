										//calling a class in another class 

class Test1
{
	void testing(int x,int y)	/*paranthesis initialisation- not a main method */
	{	
		int z=x+y;
		System.out.println(z);
	}
	Test1(int x,int y)			//parameterised constructor for Test1
	{
		int z=x+y;
		System.out.println(z);
	}
	//Test1()						//constructor
	//{
	//}
	
}
class Test
{
	
	public static void main(String args [])		//main method
		{
		Test1 obj1=new Test1(20,30);		//object creationh
		obj1.testing(10,20);						//x and y values are initialised	
		//obj.x=10;
		//obj.y=20;
		Test obj=new Test(10,50);
		//Test1 obj1=new Test1();
	}
	Test(int x,int y)							//parameterised constructor
	{
		int z=x+y;
		System.out.println(z);
	}
}
		