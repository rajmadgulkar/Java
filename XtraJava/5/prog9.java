import java.util.*;
class Divisors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        div(num);
    }
    public static void div(int num){
        System.out.println("The divisors of "+num+ ":");
        int i=1;
        while(i<=num/2){
            if(num%i==0){
                System.out.println(i);
            }
            i++;
        }
    }


}