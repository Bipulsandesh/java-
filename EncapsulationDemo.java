package javaoops;
class Customers
{
	String cusAccNo;  // default data member
	private  String cusAccPwd="00000";  // private data member
	void setter(String pwd)
	{
		this.cusAccPwd= pwd;
	}
	String getter()
	{
		return cusAccPwd;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		Customers c1 = new Customers();
		c1.cusAccNo ="45678901";
		//c1.cusAccPwd="wel123";//The field Customer.cusAccPwd is not visible
		 
	    c1.setter("wel123");
	    System.out.println("Customer Account Number : "+c1.cusAccNo );
	   // System.out.println("Customer Password: "+c1.cusAccPwd); //The field Customer.cusAccPwd is not visible
	    System.out.println("Customer password :"+ c1.getter());
	}

}
