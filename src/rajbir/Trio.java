package rajbir;

public class Trio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c=2,d,i,n=5;
		System.out.println(+a +"\n" +b +"\n" +c);
		for(i=1;i<=n;i++)
		{
			d=a+b+c;
			System.out.println(d);
			a=b;
			b=c;
			c=d;
		}
		}
			
		
		

	}

