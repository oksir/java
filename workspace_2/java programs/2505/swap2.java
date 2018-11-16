class Swap2
{
public static void main(String args[])
{
int a=100;
int b=190;
System.out.println("value of a and b before swaping is " +a+ "\t"+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("value of a and b after	swaping is " +a+	"\t"+b);
System.out.println(a +"\n"+ b);
}
}