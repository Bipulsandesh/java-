package javaoops;
class Bank1  // parent
{
	double getRateOfInterest()
	{
		return 5;
		
	}
}

class SBI extends Bank1  // SBI - child1
{
	@Override
	double getRateOfInterest()
	{
		return 7;
		
	}
}

class ICICI extends Bank1 // ICICI- child2
{ 
	@Override
	double getRateOfInterest()
	{
		return 9;
		
	}
} 
class AXIS extends Bank1  //Axis - child3
{	
   @Override
   double getRateOfInterest()
	{
		return 8;
		
	}
}
public class MethodOverridingRealTimeExample {

	public static void main(String[] args) {
		Bank1 c1 = new SBI();
		System.out.println("Rate of interest of SBI ="+c1.getRateOfInterest());
		Bank1 c2= new ICICI();
		System.out.println("Rate of interest of ICICI ="+c2.getRateOfInterest());
	    Bank1 c3 = new AXIS();
	    System.out.println("Rate of interest of AXIS ="+c3.getRateOfInterest());
	    
	}

}
