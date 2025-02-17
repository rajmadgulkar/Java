import java.util.*;

class VoteAge{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age:");
		int age=sc.nextInt();

		if(age<0){
			System.out.println("Invalid Age.");

		}else if(age>=18){
			System.out.println("Valid age for Voting.");


		}else{
			System.out.println("Invalid Age for Voting.");


		}




	}



}
