package rajbir;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean flag=true;
		System.out.println("enter any number");
		int n=s.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
			}
		if(flag==true)
		{
			System.out.println("prime");
		}
		else
			
			System.out.println("not prime");
	}
}
		