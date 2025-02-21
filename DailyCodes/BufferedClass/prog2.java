import java.util.*;

class Company{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Company Name:");
		String cmpName=sc.next();

		System.out.print("Enter company location:");
		String cmpLoc=sc.next();
		
		System.out.print("Enter employee count:");
		int cmpEmp=sc.nextInt();

		System.out.print("Enter average salary:");
		float cmpSal=sc.nextFloat();


		System.out.println(cmpName);
		System.out.println(cmpLoc);
		System.out.println(cmpEmp);
		System.out.println(cmpSal);



	}



}
