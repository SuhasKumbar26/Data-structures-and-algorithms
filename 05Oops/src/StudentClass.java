import ClassBasics.Student;

public class StudentClass {

    public static void change(Student s){
        s.name = "Java";
    }

    // main method
    public static void main(String[] args) {
        Student stu1 = new Student("Java",890, 89.0f);
        Student stu2 = new Student("Java",890, 89.0f);

        System.out.println(Student.getNoOfStudent()); // static belongs to Class.
    }
}
