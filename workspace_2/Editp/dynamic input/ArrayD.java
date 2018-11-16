import java.util.*; //for scanner class 
class ArrayD
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); //dynamic input
		
		System.out.print("Enter the number of Array Elements : ");
		int n=sc.nextInt();								//providing dynamic input

		int x[]=new int[n];
	
		for(int i=0;i<x.length;i++)					//for entering array elements
		{
			System.out.println("please enter " +i +"th Element : " +i );
			x[i]=sc.nextInt();
		}
		
		System.out.println("you entered the below numbers : ");
		
		for(int j:x)				//for retrieving array elements.
		System.out.println(j);

		int temp=0;
		for(int k=0;k<x.length;k++)				//for adding array elements.
		{
			temp=temp+x[k];
		}
		System.out.println("The sum of the array elements is : "temp);
	}
}
