
public class Test28 {

	static int x=10;
	public static void main(String[] args) {
		disp();
		Test28 obj=new Test28();
		obj=show();	
	}
	static public void disp()
	{
		System.out.println("Display");
		x=50000;
	}
	
	public static Test28 show()
	{
		System.out.println("Show");
		System.out.println(x);
		return null;
	}

}
