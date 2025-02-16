import java.util.*;

class RelationalOp{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First Number:");
		int firstNum=sc.nextInt();
		System.out.print("Enter the Second Number:");
		int secondNum=sc.nextInt();

		
		System.out.println(firstNum + " > " + secondNum + " : "+(firstNum>secondNum));
		System.out.println(firstNum + " < " + secondNum + " : "+(firstNum<secondNum));
		System.out.println(firstNum + " == " + secondNum + " : "+(firstNum==secondNum));
		System.out.println(firstNum + " != " + secondNum + " : "+(firstNum!=secondNum));
		System.out.println(firstNum + " >= " + secondNum + " : "+(firstNum>=secondNum));
		System.out.println(firstNum + " <= " + secondNum + " : "+(firstNum<=secondNum));




	}

}
