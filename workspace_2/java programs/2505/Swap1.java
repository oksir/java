/*to swap two numbers using one temporary variable*/

class Swap1 
{
	public static void main(String [] args) 							//main class
		{
			int a=10;
			int b=20;
			System.out.println("before swap:\n"	+"\n"+	"value of a is:" +a + "\n" + "value of b is:	" +b+"\n");
			/*swap logic is performed below*/
			int c=a;					//temporary variable is c here
			a=b;
			b=c;
			System.out.println("after swap:\n"+"\n"+	"value of a and b is " +a+"," + b+" " +"respectively");		//to print swapped output
			
		}
}