import java.util.*;

class Flat{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Society Name:");
		String socName=sc.next();

		System.out.print("Enter Society Wing:");
		char socWing=sc.next().charAt(0);
		
		System.out.print("Enter Flat No:");
		int socNo=sc.nextInt();

		System.out.print("Enter Flat Rent:");
		float socRent=sc.nextFloat();


		System.out.println(socName);
		System.out.println(socWing);
		System.out.println(socNo);
		System.out.println(socRent);



	}



}
