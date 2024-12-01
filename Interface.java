interface Person {
    void speak();
}


class Student implements Person {
    @Override
    public void speak() {
        System.out.println("I am a student and I love learning!");
    }
}

class Teacher implements Person {
    @Override
    public void speak() {
        System.out.println("I am a teacher and I enjoy sharing knowledge!");
    }
}


public class Interface {
    public static void main(String[] args) {

        Person student = new Student();
   
        student.speak();

      
        Person teacher = new Teacher();
       
        teacher.speak();
    }
}

