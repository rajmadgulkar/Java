
import java.util.*;
class LCMOPT{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int first=sc.nextInt();
        System.out.println("Enter second number:");
        int second=sc.nextInt();

        System.out.println("The LCM is:"+LCMf(first,second));


    }
    public static int LCMf(int first,int second){
        int i=1;
        while(true){
            int factor=i*first;
            if(factor%second==0){
                return factor;
            }

            i++;
        }

    }

}