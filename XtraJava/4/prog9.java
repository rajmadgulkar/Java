import java.sql.SQLOutput;
import java.util.Scanner;

class LCM{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int fNum=sc.nextInt();
        System.out.println("Enter second number:");
        int sNum=sc.nextInt();

        System.out.println("The LCM of "+fNum+" & "+sNum+" is:"+LCMfunction(fNum,sNum));


    }
    public static int LCMfunction(int fNum,int sNum){
        int i=1;

        while(i<=sNum) {

            if(i%fNum==0&&i%sNum==0){
                return i;
            }
            i++;
        }
        return 0;
    }
}