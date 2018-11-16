import java.io.*;
class CmdLine
{
	public static void main(String[] args) throws IOException
	{
		//String x[]=new String[2];
		System.out.print(args[0]);
		System.out.print(args[1]);
		System.out.println(args.length);

		for(String S:args)
		{
			System.out.println(S);
		}
	}

}
