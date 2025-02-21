
import java.util.*;

class STest{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome");


		System.out.print("Enter Street Name:");
		//String sName=sc.next();
		String sName=sc.nextLine();

		System.out.print("Enter Lane:");
		char lName=sc.next().charAt(0);

		System.out.print("Enter house Number:");
		int hNo=sc.nextInt();

		System.out.print("Enter current house price:");
		float hPrice=sc.nextFloat();
		

		System.out.println("Property details:");

		System.out.println("Street name:"+sName);
		System.out.println("Lane name:"+lName);
		System.out.println("House Number:"+hNo);
		System.out.println("Current price:"+hPrice+"Lakhs");

	}



}
