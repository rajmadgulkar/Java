import java.util.*;
class FactorialDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find its factorial:");
        int num=sc.nextInt();
        int fact=1;
        int i=num;
        while(i>1){
            fact*=i;
            i--;
        }
        System.out.println("A factorial of "+num+" is "+fact);
    }
}