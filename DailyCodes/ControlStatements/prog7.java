import java.util.*;
class prog7{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the a number:");
		int checkNum=sc.nextInt();
		if(checkNum%2==0){
			System.out.println(checkNum+"is an even number.");
		}else{
			System.out.println(checkNum+"is an odd number.");

		}
	}

	
}
