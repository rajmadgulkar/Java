import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        int factors=CheckPrime(num);
        if(factors==2){
            System.out.println(num+" is prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }


    }
    public static int CheckPrime(int num){
        int fact=0;
        int i=1;
        while(i<=num){

            if(num%i==0){
                fact++;
            }

            i++;
        }
        return fact;
    }

}