package ClassBasics;

public class Student {

    public static int noOfStudent;

    public String name ;

    public final String SchoolName = "K.R.E.S" ;

    public int rno;

    public double percent;


    public Student(String name, int rno, double percent){
        this.name = name;
        this.rno = rno;
        this.percent = percent;
        noOfStudent++;
    }

    public Student(){

    }

    public static int getNoOfStudent(){
        return noOfStudent;
    }

}
