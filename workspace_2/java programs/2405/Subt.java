/* to write a program to subtract two numbers or 3 numbers */
class Subt
{
	public static void main(String [] args) //main class
	{
	/* Initialising the values to variables x,y,z. 
	   and performing subtraction operation.
	 */
		int x=400;
		int y=300;
		int z=50;
		int a=x-y;
		int b=x-z;
		int c=y-z;
		
	/**printing the output with the variables a,b,c.
	   and to add with different combinations */

		System.out.println("subtraction of x and y is " +a);
		System.out.println("subtraction of x and z is " +b);
		System.out.println("subtraction of y and z is " +c);
		System.out.print("x-y-z is ");  					//this will print x+y+z only,not the value.
		System.out.println(x-y-z);
		System.out.print("x-y is ");						//don't return any value
		System.out.println(x-y);
		System.out.print("y-z is ");						// don't return anything
		System.out.println(y-z);
	}
}