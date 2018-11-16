class Bitwe
{
	public static void main(String args [])
	{
		int a=1;
		int b=4;
		int c=5;
		int d=2;
		int e=3;
		int i,j,x,y,z;
		x=a&b;
		y=c|b;
		z=d^e;
		i=(e>>b);
		j=(b<<c);	
		System.out.println(x+"\n"+ y + "\n" +z +"\n"+i+"\n"+j);
	}
}