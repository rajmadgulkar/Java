import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.next();

		String reversed = new StringBuilder(str).reverse().toString();

		if(str.equals(reversed)){
			System.out.println("Palindrome");
		}else{

			System.out.println("Not a Palindrome");
		}

	}

}
