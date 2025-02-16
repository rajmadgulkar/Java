import java.util.*;

class ArithOp{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First Number:");
		int firstNum=sc.nextInt();
		System.out.print("Enter the Second Number:");
		int secondNum=sc.nextInt();

		
		System.out.println("Addition: "+firstNum + " + " + secondNum + " = "+(firstNum+secondNum));
		System.out.println("Substraction: "+firstNum + " - " + secondNum + " = "+(firstNum-secondNum));
		System.out.println("Multiplication: "+firstNum + " * " + secondNum + " = "+(firstNum*secondNum));
		System.out.println("Division: "+firstNum + " / " + secondNum + " = "+(firstNum/secondNum));




	}

}
