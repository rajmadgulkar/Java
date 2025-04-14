import java.util.*;
class NumDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int x;
        int sum=0;
        while(num>0){
            x=num%10;
            sum+=x;
            num=num/10;
        }
        System.out.println("The sum of the digits of number is:"+sum);
    }
}