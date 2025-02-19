import java.util.*;

class Cal{

	public static void main(String[]args){


		Scanner sc=new Scanner(System.in);
		System.out.print("num1:");
		int num1=sc.nextInt();

		System.out.print("num2:");
		int num2=sc.nextInt();

		System.out.print("Operation:");
		char op=sc.next().charAt(0);

		switch(op){
			case '+':
				System.out.println("Output:"+(num1+num2));
				break;
			case '-':
				System.out.println("Output:"+(num1-num2));
				break;
			case '*':
				System.out.println("Output:"+(num1*num2));
				break;

			case '/':
				System.out.println("Output:"+(num1/num2));
				break;

			default:
				System.out.println("Invalid Operation");
				break;




		}



	}


}
