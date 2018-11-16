class Demo
{
	String name;
	
	Demo() 
	{
		System.out.println("I'm in Constructor");
	
	}

	Demo(String str1)
	{
		name=str1;
	}

	public void show()
	{
		System.out.println(name);

	}

}	 
class Client1
{
	public static void main(String [] args)
	{
		Demo obj=new Demo();
		obj.show();

		
	}
}



