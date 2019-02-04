package rajbir;
import java.util.Scanner;
class Marriage1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter your gender");
String gender=sc.nextLine();
System.out.println("Enter your age");
int age=sc.nextInt();

if(age>=18 && gender.equals("female"))
System.out.println("Eligible to Marry");
else if(age>=18 && gender.equals("male"))
System.out.println("Eligible to Marry");

else
System.out.println("Not Eligible to Marry");
}
}