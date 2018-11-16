/* to write a program to get the output as add=32;subt=2;multi=225;div=1 */
class Kart
{
	public static void main(String [] args)
	{
		int x=13;
		int y=15;
		x=++x;
		x=++x;
		System.out.println("\""+x*y+"\"" + " is the multipication of the 2 numbers \n");
		System.out.println("\""+x/y+"\"" + " is the division of 2 numbers ");
		//System.out.println("\n" +x + "\n");
		x=++x;
		x=++x;
		System.out.println("\""+ (x-y) +"\"" + " is the subtraction value of 2 numbers");
		System.out.println("\""+ (x+y) +"\"" + " is the addition of 2 numbers");
	}
}
