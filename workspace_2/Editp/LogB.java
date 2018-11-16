		//Sixth Program: Bitwise Operator

class LogB
{
	public static void main(String args [])
	{
		int x=-0101;	//octal
		int y=0010;
		int z=0011;
		int a,b,c,d;
		a=x&y;			//and
		b=x|z;			//or
		c=y^z;			//ex=or
		d=(~x);			//transpose
		System.out.println("and :" +a);
		System.out.println("or :" +b);
		System.out.println("ex-or :" +c);
		System.out.println("Transpose :" +d);
	}
}
