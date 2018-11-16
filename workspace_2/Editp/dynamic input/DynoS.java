import java.io.*;
class DynoS
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Select the rank between 1-5 : ");
		String s=br.readLine();
		int r=Integer.parseInt(s);

		switch(r)
		{

		case 1 :
			
				System.out.println("Name	:	god1" );
				System.out.println("Roll No	:	a143");
				System.out.println("Address	:	kailasam");
				System.out.println("Father's Name:	bhagwan");
				System.out.println("Mother Tongue:	all");
				System.out.println("Aadhar Details:	*********");
				break;
			
		case 2 :		
					
				System.out.println("Name	:	god2" );
				System.out.println("Roll No	:	b143");
				System.out.println("Address	:	swargam");
				System.out.println("Father's Name:	devuda");
				System.out.println("Mother Tongue:	no lipi");
				System.out.println("Aadhar Details:	*********");
				break;
			
		case 3 :
			
				System.out.println("Name	:	god3");
				System.out.println("Roll No	:	c143");
				System.out.println("Address	:	adishtanam");
				System.out.println("Father's Name:	bagvantuda");
				System.out.println("Mother Tongue:	no lang");
				System.out.println("Aadhar Details:	***********");
				break;

		case 4 :
			
				System.out.println("Name	:	god4");
				System.out.println("Roll No	:	d143");
				System.out.println("Address	:	ananda nilayam");
				System.out.println("Father's Name:	adhideva");
				System.out.println("Mother Tongue:	****");
				System.out.println("Aadhar Details:	*********");
				break;

		case 5 :
			
				System.out.println("Name	:	god5" );
				System.out.println("Roll No	:	e143");
				System.out.println("Address	:	santosha nilayam");
				System.out.println("Father's Name:	atma");
				System.out.println("Mother Tongue:	not specified");
				System.out.println("Aadhar Details:	************");
				break;

		default:
			
				System.out.println("Name	:	rod" );
				System.out.println("Roll No	:	0000");
				System.out.println("Address	:	vadhu ley");
				System.out.println("Father's Name:	chepanu brother");
				System.out.println("Mother Tongue:	kilkili");
				System.out.println("Aadhar Details:	**********");
				System.out.println("\n\n \t please enter 1-5 rank only ..... : ");
				break;
		}
	}
}
