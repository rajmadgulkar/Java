import java .util.*;
class Reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num:");
        int num=sc.nextInt();
        int reverse=reverse(num);
        System.out.println("Reverse of your number is: "+reverse);


    }
    public static int reverse(int num){
        int reverseNum=0;
        while(num>0){
            int digit = num %10;
            reverseNum=reverseNum*10+digit;

            num/=10;

        }
        return reverseNum;
    }
}