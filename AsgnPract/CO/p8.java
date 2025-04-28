import java.util.*;
class Teacher{
    String thName;
    String thSubject;
    float thexperience;
    Teacher(String thName,String thSubject,float thexperience){
        this.thName=thName;
        this.thSubject=thSubject;
        this.thexperience=thexperience;
    }
    void teacherInfo(){
        System.out.println("______________________________________");
        System.out.println("Name:"+thName);
        System.out.println("Subject:"+thSubject);
        System.out.println("Experience:"+thexperience);
        System.out.println("______________________________________");
        if(checkExperience()){
            System.out.println(thName+" is an experienced teacher.");
        }else{
            System.out.println(thName+" is not that experienced teacher.");
        }

    }
    boolean checkExperience(){
        float expParameter=5.0f;
        if(thexperience>=expParameter){
            return true;
        }
        return false;
    }
}

class Client{
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter name:");
        String thName=sc.nextLine();
        System.out.print("Enter subject:");
        String thSubject=sc.nextLine();
        System.out.print("Enter experience:");
        float thexperience=sc.nextFloat();

        Teacher obj=new Teacher(thName,thSubject,thexperience);
        obj.teacherInfo();


    }
}