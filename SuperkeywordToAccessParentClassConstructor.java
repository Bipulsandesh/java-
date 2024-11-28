package javaoops;

class Person  // Person: parent class
{
	int age;  // instance variable or non-static variable
	String name;
	Person(int age, String name)
	{
		this.name = name;
		this.age = age;
	}
	void disp()
	{
		System.out.println( " I am "+name+" and my age is "+age);
	}
}

class Candidate extends Person // Student: child class
{
	char grade;
	Candidate(int age, String name, char grade)
	{
		super(age, name);
		this.grade= grade;
		
	}
	@Override
	void disp()
	{
		super.disp();
		System.out.println(" I am  in the grade "+grade);
	}
}

public class SuperKeywordToAccessParentClassConstructor {

	public static void main(String[] args) {
		Candidate s1 =new Candidate(14, "Tom", '9');
		s1.disp();
	}

}
