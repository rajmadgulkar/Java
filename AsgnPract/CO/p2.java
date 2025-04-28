import java.util.*;
class Student{
    String studentName;
    int studentRollno;
    int studentMarks;

    Student(String studentName,int studentRollno,int studentMarks){
        this.studentName=studentName;
        this.studentRollno=studentRollno;
        this.studentMarks=studentMarks;
    }
    void CheckResult(){
        System.out.println("------------------------------------------");
        System.out.println("The name of student is:"+studentName);
        System.out.println("The roll no of student is:"+studentRollno);
        System.out.println("The marks of student is:"+studentMarks);
        if(CheckPass(studentMarks)){
            System.out.println(studentName+" has passed and promoted.");
        }else{
            System.out.println(studentName+" has not passed.");
        }

    }
    boolean CheckPass(int studentMarks){
        int passCriteria=40;
        if(studentMarks>=passCriteria){
            return true;
        }
        return false;
    }
}
class Client{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter student name:");
        String studentName=sc.nextLine();
        System.out.print("Enter student Roll no:");
        int studentRollno=sc.nextInt();
        System.out.print("Enter student marks:");
        int studentMarks=sc.nextInt();

        Student obj=new Student(studentName,studentRollno,studentMarks);
        obj.CheckResult();

    }
}