package TestStudent;

import ClassBasics.Student; // import statement is required bcz it's outside the package

public class test {
    public static void main(String[] args) {
        Student st1 = new Student();
//        st1.rno
        // no access due to default (same package access only)
    }
}
