class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void study() {
        System.out.println("I am studying for grade: " + grade + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Bipul", 22, "A");

        student1.speak();

        student1.study();
    }
}
/*
 output:
My name is Bipul and I am 22 years old.
I am studying for grade: A.
 */
