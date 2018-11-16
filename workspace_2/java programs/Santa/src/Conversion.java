import java.util.Scanner;

public class Conversion
{

	  
    public static void main(String args[])
    {
        // Ask user to enter an Hexadecimal number in Console
        System.out.println("Please enter Hexadecimal number : ");
        Scanner sc = new Scanner(System.in);
      
        String hexadecimal = sc.next();
      
     
        int decimal = Integer.parseInt(hexadecimal, 16);
      
        System.out.println("Converted Decimal number is : " + decimal);
    
           
        String binary = Integer.toBinaryString(decimal);
        System.out.printf("Hexadecimal to Binary conversion of %s is %s %n", hexadecimal, binary );
      
     
        String octal = Integer.toOctalString(decimal);
        System.out.printf("Hexadecimal to Octal conversion of %s is %s %n", hexadecimal, octal );
}
}