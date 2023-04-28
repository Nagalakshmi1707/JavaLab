
public class Test {
	public static void main(int a)
	{
		System.out.println("main method is overload with int argument");
		
	}
	public static void main(String a)
	{
		System.out.println("main method is overload with string argument");
		
	}

	public static void main(String[] args) {
		main(5);
		main("Nagalakshmi");
		

	}

}
