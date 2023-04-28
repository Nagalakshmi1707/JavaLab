import java.util.Scanner;

public class Task {
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int x1=0,x2=1;
		System.out.print(x1+" "+x2+" ");
		for(int i=1;i<=n-2;i++)
		{
			int x=x1+x2;
			System.out.print(x+" ");
			x1=x2;
			x2=x;
		
		}
		

	}

}
