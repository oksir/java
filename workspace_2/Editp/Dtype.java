	//Fourth Program: case CASTING

class Dtype
{
	public static void main(String args [])
	{
		byte b=10;	//range=-128 to 127.
		short s=225;	//2 bytes
		int i=1000;	//4 bytes
		long l=10000;	//8 bytes
		float f=10.0f;	//4 bytes
		double d=400.55;	//8 bytes
		char ch='C';	//2 bytes
		boolean b1=true;	//not specified
		int x=0,y=0,z=0;
		//System.out.println(b + "\t"+ s +"\t"+ i +"\t"+ l +"\t"+ f +"\t"+ d +"\t"+ ch +"\t" + b1);
		x=b+s;
		y=(int)l/b;
		f=(float)d;
		z=(int)f;
		System.out.println("b+s=" +x);
		System.out.println("l/b=" +y);
		System.out.println("d%f=" +z);
		System.out.println("f=" +f);

	}
}
