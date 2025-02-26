
import java.util.Scanner;

class Factoria {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial:");
        int num=sc.nextInt();

        long returnfact=Fact(num);
        System.out.println("The factorial of "+num+" is:"+returnfact);

    }
    public static long Fact(int num){
        int fact=1;
        if(num<2){
            return 2;
        }
        int i=2;
        while(i<=num){

            fact*=i;
            i++;

        }
        return fact;
    }

}