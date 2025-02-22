import java.util.*;

class Perimeter{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("A:");
		int a=sc.nextInt();

		System.out.print("B:");
		int b=sc.nextInt();

		System.out.print("C:");
		int c=sc.nextInt();

		System.out.print("D:");
		int d=sc.nextInt();

		float perimeter=a+b+c+d;

		System.out.println("The perimeter of rectangle is: "+(perimeter));

	}


}
