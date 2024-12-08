package javaoops;
interface M{  // parent1 - M  - interface
	void msg();  // abstract method
	
}

interface N{  // parent2 --> N-interface
	void msg();  // abstract method
}

class C implements M,N  // child --> C-class
{
	public void msg()
	{
		System.out.println("Interface M and N, msg method is implemented in Class C");
	}
}
public class SolvingDiamondProblem {

	public static void main(String[] args) {
		C obj = new C();
		obj.msg();
	}

}
