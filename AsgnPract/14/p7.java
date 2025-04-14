import java.util.*;
class EvenDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int x;
        int sum=0;
        while(num>0){
            x=num%10;
            if(x%2==0){
                sum+=x;
            }
            num=num/10;
        }
        System.out.println("The sum of the even digits of number is:"+sum);
    }
}