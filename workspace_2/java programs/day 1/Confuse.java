class Confuse
{
public static void main(String [] args)
{
int year=2000;

if (year is not divisible by 4) then (it is a common year)
else if (year is not divisible by 100) then (it is a leap year)
else if (year is not divisible by 400) then (it is a common year)
else (it is a leap year)

System.out.println(year);
}