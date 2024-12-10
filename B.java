package pack1;

public class B {

	int b =100; // default data member
	void display()  // default method
	{
		System.out.println("Class B dafault display method is executed");
		System.out.println(b);
	}
	
	protected int c=500; // protected data member
	protected void show() // protected method
	{
		System.out.println("Class B, protected show method is executed");
		System.out.println(c);
	}
}
