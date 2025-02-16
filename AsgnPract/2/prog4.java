import java.util.*;

class BitwiseOp{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first integer:");
		int firstInt=sc.nextInt();
		System.out.print("Enter the second integer:");
		int secondInt=sc.nextInt();

		System.out.println("Bitwise AND: "+firstInt+"&"+secondInt+"="+(firstInt&secondInt));
		System.out.println("Bitwise OR: "+firstInt+"|"+secondInt+"="+(firstInt|secondInt));
		System.out.println("Bitwise XOR: "+firstInt+"^"+secondInt+"="+(firstInt^secondInt));
		System.out.println("Left Shift: "+firstInt+"<<"+"1"+"="+(firstInt<<1));
		System.out.println("Right Shift: "+firstInt+">>"+"1"+"="+(firstInt>>1));


		


	}


}
