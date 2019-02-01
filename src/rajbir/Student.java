package rajbir;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
		// TODO Auto-generated method stub
		String roll_no;
		String name;
		char grade;
		double eng_marks;
		double math_marks;
		double sci_marks,total_marks,average;
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		Student()throws IOException
		{
			System.out.println("enter roll_no");
			roll_no=s.readLine();
			System.out.println("enter name");
			name=s.readLine();
			System.out.println("enter eng_marks");
			eng_marks=Double.parseDouble(s.readLine());
			System.out.println("enter math_marks");
			math_marks=Double.parseDouble(s.readLine());
			System.out.println("enter sci_marks");
			sci_marks=Double.parseDouble(s.readLine());
		}
			void cal_total_marks()
			{
				total_marks=(int)(eng_marks+math_marks+sci_marks);
			}
			void cal_Average()
			{
				average=(int)(eng_marks+math_marks+sci_marks/3);
			}
			void find_grade()
			{
				if(average>=85)
				{
					System.out.println(name+" "+average);
					System.out.println("A+ grade");
				}
				else if(average>=70 && average<85)
				{
					System.out.println(name+" "+average);
					System.out.println("A grade");
				}
				else if(average>=50 && average<70)
				{
					System.out.println(name+" "+average);
					System.out.println("B grade");
				}
				else if(average>=40 && average<50)
				{
					System.out.println(name+" "+average);
					System.out.println("C grade");
				}
			}
				public static void main(String[]args)throws IOException
				{
				Student s1=new Student();
					Student s2=new Student();
					Student s3=new Student();
					{
						s1.cal_total_marks();
						s2.cal_total_marks();
						s3.cal_total_marks();
						s1.cal_Average();
						s2.cal_Average();
						s3.cal_Average();
						s1.find_grade();
						s2.find_grade();
						s3.find_grade();
					}
				}
		}
