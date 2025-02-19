import java.util.*;

class myExample{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks out of 50, Aptitude Test:");
		int num1=sc.nextInt();
		System.out.print("Enter marks out of 50, Technical Test:");
		int num2=sc.nextInt();

		int num3=num1+num2;

		if(num1>30&&num2>30){

			switch(num3/10){

				
				case 6:
				       System.out.println("Eligible for 3.00LPA");
			       	       break;


				case 7:
				       System.out.println("Eligible for 4.00LPA");
			       	       break;
				case 8:
				       System.out.println("Eligible for 8.00LPA");
			       	       break;
				case 9:
				       System.out.println("Eligible for 12.00LPA");
			       	       break;
				default:
				       System.out.println("Invalid Marks");
				       break;

			}

		}else{

			System.out.println("You are not qualified");


		}


	}


}
