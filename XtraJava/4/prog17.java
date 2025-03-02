import java.util.*;
class Palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        boolean n=isPalindrome(num);
        if(n){
            System.out.println(num+" is Palindrome.");
        }else{
            System.out.println(num+" not a Palindrome.");
        }


    }
    public static boolean isPalindrome(int num){

        int tempNumber=num;
        int newNumber=0;
        int digit=0;

        while(num>0){
            digit=num%10;
            newNumber=newNumber*10+digit;
            num/=10;
        }
        if(tempNumber==newNumber){
            return true;
        }
        return false;
    }
}