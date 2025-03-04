import java.util.*;

class Prog2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num:");
        int first=sc.nextInt();
        System.out.println("Enter the second num:");
        int second=sc.nextInt();
        System.out.println("Enter the third num:");
        int third=sc.nextInt();

        int returnInt=Max(first,second,third);
        System.out.println("The maximum no is:"+returnInt);



    }
    public static int Max(int first, int second,int third){

        if(first>second&&first>third){
            return first;
        }else if(second>third){
            return second;
        }else{
            return third;
        }

    }
}