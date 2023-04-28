import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int s=0;
		while(n!=0)
		{
			int r=n%10;
			int f=1;
			for(int i=1;i<=r;i++)
			{
				f=f*i;
				
			}
			s=s+f;
			n=n/10;
			
					
		}
		if(s==num)
			System.out.println("strong number");
		else
			System.out.println("not strong number");

	}

}
