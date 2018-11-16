import java.io.*;
class Dinpu4
{
	public static void main(String[] args) throws IOException
	{
		Console C=System.console();

		System.out.println("Enter Your Name : ");
		String name=C.readLine();

		System.out.println("Enter Your Age : ");
		byte age=Byte.parseByte(C.readLine());

		System.out.println("Enter Your sex : ");
		Character sex=C.readLine().charAt(0);

		System.out.println("Enter Your Marrital status :");	
		Boolean marriage=Boolean.parseBoolean(C.readLine());

		System.out.println("Enter Your AADHAR Details : ");
		Long aadhaar=Long.parseLong(C.readLine());

		System.out.println("Enter Your Mobile Number : ");
		Long mobileNumber=Long.parseLong(C.readLine());

		System.out.println("..................................................");

		System.out.println("Entered name is : "+name +"\n "+"Entered age is :"+age+"\n "+"Entered sex is :"+sex+"\n "+"You are married : "+marriage+"\n "+"Entered Aadhaar no: "+aadhaar+"\n"+"Entered Mobile No :"+mobileNumber);

	}
}