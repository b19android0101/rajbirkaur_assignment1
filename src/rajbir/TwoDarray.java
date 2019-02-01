package rajbir;
import java.util.Scanner;

public class TwoDarray{ 

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int[][] marks=new int[3][4];
		System.out.println("marks.length");
		Scanner sc=new Scanner(System.in);
System.out.println("enter elements in 2D array");
for(int i=0;i<marks.length;i++)
{
	for(int j=0;j<marks[i].length;j++)
	{
		marks[i][j]=sc.nextInt();
	}
}
	System.out.println("Array elements are");
	for(int i=0;i<marks.length;i++)
	{
		for(int j=0;j<marks[i].length;j++)
		{
			System.out.print(marks[i][j]+"\t");
		}
		System.out.println();
}
}
}
				

	
