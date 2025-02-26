import java.util.Scanner;

class SumofInteger{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num for sum of integers:");
        int num=sc.nextInt();

        int sum=Sumofint(num);
        System.out.println("The sum of integers of "+num+" is:"+sum);

    }
    public static int Sumofint(int num){
        int i=num;
        int test;
        int sum=0;
        while(i>0){
            test=i%10;
            sum+=test;
            i=i/10;

        }
        return sum;
    }

}