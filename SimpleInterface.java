package javaoops;
interface ATM
{
	void withdrawMoney(double m);
	void checkBalance();
}

class ATMInside implements ATM
{
	public void withdrawMoney(double m)
	{
		System.out.println("The money is taken from ATM = "+m);
	}
    public void checkBalance()
    {
    	System.out.println("The Balance is displayed ");
    }
}

public class SampleInterface {

	public static void main(String[] args) {
		ATM c1 =new ATMInside();
		c1.withdrawMoney(2000);
		c1.checkBalance();
		
		ATMInside c2 = new ATMInside();
	    c2.withdrawMoney(1000);
	    c2.checkBalance();
		
	 } 

}
