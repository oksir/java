import java.io.*;
class DynaAr
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the kind of array you need : \n 1) Integer 2) float 3) char 4) long ");
		String s=br.readLine();
		int i=Integer.parseInt(s);

		switch(i)
		{
		case 1:
			System.out.println("Enter the number of Integer Array : ");
			String s1=br.readLine();
			int i1=Integer.parseInt(s1);
			
			int x[]=new int[i1];
			for(int j=0;j<x.length;j++)
			{
				System.out.println(" Enter the "+j+"th element : ");
				String s2=br.readLine();
				int i2[]=Integer.parseInt(s2);
			}	
			System.out.println("Your entered values are  : ");
			
						for(int y:x)
							System.out.println(y);
		}
	
	}
}
