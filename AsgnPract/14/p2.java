import java.util.*;
class PrimeDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 1:");
        int num = sc.nextInt();

        int count=0;
        int i=1;
        while(i<=num){

            if(num%i==0){
                count++;
            }
            i++;
        }

        if(count==2){
            System.out.println(num+" is a prime number.");
        }else{
            System.out.println(num+" is not a prime number.");
        }
    }
}