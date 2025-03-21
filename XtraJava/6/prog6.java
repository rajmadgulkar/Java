import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to print its factors:");
        int num=sc.nextInt();
        printFactors(num);
    }
    public static void printFactors(int num){
        int i=1;
        while(i<=num/2){
            if(num%i==0){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.print(num);
    }
}
