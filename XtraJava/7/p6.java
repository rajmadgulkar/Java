
import java.util.*;
class Demo{


	public static boolean CheckPalindrome(int num){
		
		int rem, sum=0, temp;
		temp=num;
		while(num>0){
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		
		if(temp==sum)	return true;
		else	return false;


	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();

		if(CheckPalindrome(num)){
			System.out.println("Palindrome");
		}else{

			System.out.println("Not Palindrome");
		}

	}

}
