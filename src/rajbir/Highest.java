package rajbir;

import java.util.Scanner;

public class Highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		int i,max1,max2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 5 numbers in array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		max1=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>max1)
			{
				max1=arr[i];
	}
	max2=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if((arr[i]>max2)&&(arr[i]<max1))
			{
				max2=arr[i];
			}
	}
System.out.println("Largest 2 number is"+max2);
		}
	}
}
		
