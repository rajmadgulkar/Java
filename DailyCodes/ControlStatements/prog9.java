import java.util.*;
class prog9{
	public static void main(String[]args){
		Scanner sf=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int firstNum=sf.nextInt();

		System.out.print("Enter the second number: ");
		int secondNum=sf.nextInt();
		if(firstNum>secondNum){
			System.out.println(firstNum+" is greater than "+secondNum);

		}else{
			System.out.println(secondNum+" is greater than "+firstNum);

		}

	}
}
