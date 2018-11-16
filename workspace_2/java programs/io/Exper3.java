import java.io.*;
class Exper3
{
	public static void main(String[] args) throws IOException
	{
		Console C=System.console();

	System.out.print("Enter name : ");
	String n=C.readLine();

	System.out.println("Enter a character,so that you can find a heroine who wants to DATE with YOU or girlfriend look like ");
	char ch=C.readLine().charAt(0);
	System.out.println("\t \t ...............Enjoy......................");

		switch(ch)
		{
			case 'a':
						System.out.println("\n  . Anushka : wants to DATE with YOU or you will get a girl like HER  .... ");
						break;
			case 'b':
						System.out.println("\n  . Bhumika : wants to DATE with YOU or you will get a girl like HER  ....");
						break;
			case 'c':
						System.out.println("\n  . Charmie : wants to DATE with YOU or you will get a girl like HER  ....");
						break;	
		
			case 'd':
						System.out.println("\n  . Dia Mirza : wants to DATE with YOU or you will get a girl like HER  ....");
						break;
			case 'e':
						System.out.println("\n  . Esha Deol : wants to DATE with YOU or you will get a girl like HER  ....");
						break;
			case 'f':
						System.out.println("\n  . Freida Pinto : wants to DATE with YOU or you will get a girl like HER  ....");
						break;
			case 'g':
						System.out.println("\n   .Genelia :  wants to DATE with YOU or you will get a girl like HER  ....");
						break;

			case 'h':
						System.out.println("\n  . Hansika : wants to DATE with YOU or you will get a girl like HER  ....");
						break;
			case 'i':
						System.out.println("\n  . Ileana D'souza : wants to DATE with YOU or you will get a girl like HER  ....");
						break;

			case 'j':
						System.out.println("\n  . jaqueline fernanadez : wants to DATE with YOU or you will get a girl like HER  ....");
						break;

			case 'k':
						System.out.println("\n  . Kajal Agarwal : wants to DATE with YOU or you will get a girl like HER  ....");
						break;

			case 'l':
						System.out.println("\n  . Lavanya tripathi : wants to DATE with YOU or you will get a girl like HER  ....");
						break;
			case 'm':
						System.out.println("\n  . Megha Akash : wants to DATE with YOU or you will get a girl like HER  ....");
						break;

			case 'n':
						System.out.println("\n  . Nithya menon : wants to DATE with YOU or you will get a girl like HER  ....");
						break;

			case 'o':
						System.out.println("\n  . Ovia Helen :  wants to DATE with YOU or you will get a girl like HER  ....");
						break;
			case 'p':
						System.out.println("\n  . Pooja Hegde : wants to DATE with YOU or you will get a girl like HER  ....");
						break;
			case 'r':
						System.out.println("\n  . Rashmi Gautam : wants to DATE with YOU or you will get a girl like HER  ....");
						break;
			
			case 's':
						System.out.println("\n  . Saipallavi : wants to DATE with YOU or you will get a girl like HER  ....");
						break;
			case 't':
						System.out.println("\n  . Tejaswi :  wants to DATE with YOU or you will get a girl like HER  ....");
						break;
			case 'u':
						System.out.println("\n  . Urmila : wants to DATE with YOU or you will get a girl like HER  ....");
						break;
			case 'v':
						System.out.println("\n  . vidyabalan : wants to DATE with YOU or you will get a girl like HER  ....");
						break;
		
			case 'y':
						System.out.println("\n  . Yami Gautam : wants to DATE with YOU or you will get a girl like HER  ....");
						break;

			case 'z':
						System.out.println("\n  . zarina khan \n wants to DATE with YOU or you will get a girl like HER  ..");
						break;

			default:
						System.out.println("\n  . Sri Reddy \n wants to DATE with YOU or you will get a girl like HER  ....");
						break;
			}
			System.out.println("\n \n \njust for fun>>>>>> "+ n +" <<<<<<Keep Smiling " );
		}	

	//System.out.println(n);
	}