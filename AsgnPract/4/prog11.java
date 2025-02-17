import java.util.*;

class PyTriplet{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("a=");
		int a=sc.nextInt();

		System.out.print("b=");
		int b=sc.nextInt();

		System.out.print("c=");
		int c=sc.nextInt();

		if(a*a+b*b==c*c){

			System.out.println("It is a Pythagorean Triplet");


		}else{
			System.out.println("It is not a Pythagorean Triplet");

		}


	}


}
