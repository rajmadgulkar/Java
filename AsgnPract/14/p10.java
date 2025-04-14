import java.util.*;
class PalindromeDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int plnum=num;
        int digit;
        int reverse=0;
        while(num>0){
            digit=num%10;
            reverse=(reverse*10)+digit;
            num=num/10;
        }
        if(plnum==reverse){
            System.out.println(plnum+" is a palindrome number.");
        }else{
            System.out.println(plnum+" is not a palindrome number.");
        }
    }
}