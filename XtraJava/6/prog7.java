import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to print its factorial:");
        int num=sc.nextInt();
        System.out.println("The factorial of "+num+"is:"+(Factorial(num)));
        
    }
    public static long Factorial(int num){
        if(num<1){
            return 1;
        }
        long fact=1;
        int i=num;
        while(i>0){
            fact*=i;
            i--;
            
        }
        return fact;
    }
}
