import java.util.Scanner;
public class Armstrong1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int num=n;
	int l=0;
	int sum=0;
	while(n!=0)
	{
		int r=n%10;
		l++;
		n=n/10;
		
				
	}
	n=num;
	while(n!=0)
	{
		int r=n%10;
		sum=(int) (sum+Math.pow(r, l));
		n=n/10;
		
	}
	if(sum==num)
		System.out.println("armstrong");
	else
		System.out.println("not armstrong");
		

	}

}
