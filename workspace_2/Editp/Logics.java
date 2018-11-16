	//Fifth Program: LOGICAL OPERATORS

class Logics
{
	public static void main(String args [])
	{
		int x=5;
		int y=10;
		int z=20;
		boolean a,b,c,d;
		a=(x+y==0) && (x-y==0);
		b=(x+y==0) || (x-y==0);
		c=!(x+y==0) && (x-y!=0);
		d=!(x+y==0) || (x-y!=0);
		System.out.println("and :" +a);
		System.out.println("or :" +b);
		System.out.println("not and :" +c);
		System.out.println("not or :" +d);
	}
}
