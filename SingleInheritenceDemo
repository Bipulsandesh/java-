package javaoops;
class Shape  // Parent class
{
	void draw()
	{
		System.out.println("The shape is drawn");
	}
	
}

class Circle extends Shape  // child class
{
	void areaOfCircle(double r)
	{
		double area =3.14 *r*r;
		System.out.println("Area of circle ="+area);
	}
}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Circle c= new Circle();
		  c.draw();
		  c.areaOfCircle(10);
		Shape s = new Shape();
		s.draw();
		//s.areaOfCircle(); // compile error
	}

}
