import java.util.*;

class PrimeOPT{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        if(PrimeCheck(num)){
            System.out.println(num+" is not a prime number");
        }else{
            System.out.println(num+" is a prime number");
        }


    }
    public static boolean PrimeCheck(int num){
        int i=2;
        while(i<num){

            if(num%i==0){
                return true;

            }
            i++;

        }
        return false;

    }

}