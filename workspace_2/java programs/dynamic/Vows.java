class Vows
{
	public static void main(String[] args)
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char w[]={'a','e','i','o','u','l','k','g','m'};
			int Count=0;
		System.out.println("Enter the array elements : ");
		String S=br.readLine();
	
			for (int i = 0; i < w.length; i++) 
			{ 
				for (int j=0; j < w[i].length(); j++) { 
				char c = w[i].charAt(j); 
			if ( (c == 'a') 
			|| (c == 'e') 
			|| (c == 'i') 
			|| (c == 'o') 
			|| (c == 'u') 
			|| (c == 'A') 
			|| (c == 'E') 
			|| (c == 'I') 
			|| (c == 'O') 
			|| (c == 'U') 
    ) 
    Count++; 
	System.out.println(Count);
   } 
  } 
 } 
}