import java.util.*;
class ExperF
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);

	System.out.println("Enter the ROLL NO of the Employee for his details(0-10) :");
	int i=s.nextInt();

	switch(i)
	{
		case '1':
					
					System.out.print("Employee name is : raj");
					String n1=s.next();

					System.out.print("Employee Salary is : 5000");
					float sal1=s.nextFloat();

					System.out.println(i+" "+ n1+" "+sal1);
					break;
					
		case '2':
				
					System.out.print("Employee name is : raja");
					String n2=s.next();

					System.out.print("Employee Salary is : 34522 ");
					float sal2=s.nextFloat();

					System.out.println(i+" "+n2 +" "+sal2); 

		default:
					System.out.println("Details not available : ");


	}			
	}
}





