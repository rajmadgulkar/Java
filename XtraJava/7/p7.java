
import java.util.*;
class Demo{


	public static int reverse(int num,int rev){
		
		if(num==0)	return rev;

		int rem=num%10;
		rev=(rev*10)+rem;
		return reverse(num/10,rev);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int rev=0;


		if(reverse(num,rev)==num){
			System.out.println("Palindrome");
		}else{

			System.out.println("Not Palindrome");
		}

	}

}
