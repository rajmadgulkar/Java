import java.util.*;

class Marks{
	public static void main(String[]args){


		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Student's name:");
		String sName=sc.next();
		
		System.out.print("Enter the Student's percentage:");
		float sPercent=sc.nextFloat();

		if(sPercent>=75&&sPercent<100){
			System.out.println("Passed : First Class with Distinction");

		}else if(sPercent>=60&&sPercent<75){
			System.out.println("Passed : First Class");

		}else if(sPercent>=50&&sPercent<60){
			System.out.println("Passed : Second Class");
		}else{
			System.out.println("Pass");


		}



	}


}
