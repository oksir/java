
public class Person
{
	String name;
	String address;
	int age;
	
	public void eat()
	{
		System.out.println("eating");
	}
	
	public void sleep()
	{
		System.out.println("Sleeping");
	}
	public static void main(String[] args)
	{
		Person raj=new Person();
		raj.sleep();
		
		Person Anud=new Person();
		Anud.eat();
	}

}
