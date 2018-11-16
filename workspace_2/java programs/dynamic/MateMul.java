import java.io.*;
class MateMul
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        //first array
        System.out.println("First array \n Enter your row size : ");
        String s1=br.readLine();
        int r1=Integer.parseInt(s1);
        
        System.out.println("Enter your column Size : ");
        String s2=br.readLine();
        int c1=Integer.parseInt(s2);
        
        int a[][]=new int[r1][c1];
        System.out.println("Enter the first array elements : ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                
                String s=br.readLine();
                 a[i][j]=Integer.parseInt(s);
            }
        }   
        
        //second array
        
        System.out.println("Second Array: \n\n Enter row size : ");
        String s3=br.readLine();
        int r2=Integer.parseInt(s3);
        
        System.out.println("Enter column size : ");
        String s4=br.readLine();
        int c2=Integer.parseInt(s4);
        
        int b[][]=new int[r2][c2];
        System.out.println("Enter second array elements : ");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                String s=br.readLine();
                 b[i][j]=Integer.parseInt(s);
            }
        }
        
        //stored values
        
        System.out.println("Stored first array is : ");
        
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }
        
        System.out.println("Stored second array is : ");
        
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println("\n");
        }
    
        //adding 2 arrays
        
        System.out.println("The Multiplication matrix of two array matrices is as follows :");
        
        int c[][]=new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<c1;k++)

                  c[i][j]=c[i][j]+a[i][k]*b[k][j];  
                System.out.print((c[i][j])+" ");
            }
            System.out.println("\n");
        }
        
            
    }
}

        