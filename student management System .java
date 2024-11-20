package javaoops;
class Student
{
	String studentName;
	int rollNo;
	int marks;
	String course;
	
	
	// default or no argument constructor
	Student()
	{
		this.studentName = "unknown";
		this.rollNo= 0;
		this.marks=0;
		this.course="unassigned";	
	}
	Student(String sName, int rNo, int m, String c)
	{
		this.studentName = sName;
		this.rollNo = rNo;
		this.marks = m;
		this.course= c;
	}
	 void displayDataMember()
	 {
		 System.out.println(studentName);
		 System.out.println(rollNo);
		 System.out.println(marks);
		 System.out.println(course);
	 }
	
}

public class StudentMgmtSystem {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.displayDataMember();
		
		Student s2 =new Student("Tom", 102, 78, "Java Full Stack");
		s2.displayDataMember();
	}

}
