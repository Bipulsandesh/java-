package javaoops;

import java.io.Serializable;
//Professors  is a java bean class, because it followed all rules of java bean 
// Serializable is an marker interface -- it is useful in serialization
class Professors implements Serializable   // rule no 4.(optional)  
{
	private int proId;     // private and non-static member   // rule no 2
	private String proName; // private and non-static member
	private String proDept;  // private and non-static member
	
    Professors()  // no argument constructor // rule no.1
    {
    	this.proId= 0;
    	this.proName ="not given";
    	this.proDept ="unknown";
    }
   // rule no. 3 -- setter and getter for all private data member
	public int getProId() {
		return proId;
	}

	public String getProName() {
		return proName;
	}

	public String getProDept() {
		return proDept;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public void setProDept(String proDept) {
		this.proDept = proDept;
	}
}

public class JavaBeanDemo {

	public static void main(String[] args) {
		Professors p1 = new Professors();
		p1.setProName("Tom");
		p1.setProId(101);
		p1.setProDept("CSE");
		  System.out.println("Professor ID: "+ p1.getProId());
		  System.out.println("Professor Name: "+p1.getProName());
		  System.out.println("Professor Dept: "+p1.getProDept());
		

	}

}
