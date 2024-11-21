package javaoops;

class TestProduct{
	int pId;
	float pPrice;
	boolean isAvailable;
	String pName;	
	// 2. no argument constructor
	TestProduct()
	{
		pId=0;
		pPrice=0.0f;
		isAvailable = false;
		pName="unknown";		
	}
	//3. parameterizied Constructor
	TestProduct(int pId, float pPrice, boolean isAvailable, String pName)
	{
		this.pId=pId;
		this.pPrice=pPrice;
		this.isAvailable = isAvailable;
		this.pName=pName;
	}	
	
	TestProduct(int a, float b, String s)
	{
	    this.pId=a;
		this.pPrice=b;
		
		this.pName=s;
	}	
	
	void disp()
	{
		System.out.println(pId);
		System.out.println(pPrice);
		System.out.println(isAvailable);
		System.out.println(pName);
	}
}
public class SampleConstructor {
	public static void main(String[] args) {
		// 1. default constructor  -- it will work only when you don't have any constructor in your program
		TestProduct t= new TestProduct();	
			System.out.println(t.pId);//0
			System.out.println(t.pPrice); // 0.0f
			System.out.println(t.isAvailable); //false
			System.out.println(t.pName); // unknown
			
		TestProduct t2= new TestProduct(102,20f, true, "pen");
		System.out.println(t2.pId);//
		System.out.println(t2.pPrice);
		System.out.println(t2.isAvailable);
		System.out.println(t2.pName);
		TestProduct t3 =new TestProduct(103,5f,"Pencil");
		System.out.println(t3.pId);//
		System.out.println(t3.pPrice);
		System.out.println(t3.isAvailable);
		System.out.println(t3.pName);
		//t3.disp();
		
	}

}
