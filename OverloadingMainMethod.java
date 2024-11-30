package javaoops;

public class OverloadingMainMethod {
	public static void main()  // main method without arguments
	{
		System.out.println("main method without parameter");
	}
	
	public static void main(int a, int b) // main method with two arguments
	{
		System.out.println("main method with two parameter a ="+a+ " b = "+b);
	}
	public static void main(String[] args)  // main method with String array as argument
	{
		main();
		main(10,20);

	}
	

}
