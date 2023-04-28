class X
{
	int a=100;
	void show()
{
		a=a+100;
		System.out.println(a);
		
}
}
public class MethodOverriding {

	public static void main(String[] args) {
		X ob=new X();
		  ob.show();

	}

}
