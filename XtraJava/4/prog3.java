import java.util.*;

class SumofD{
	public static void main(String[]args){

		System.out.println("The sum of odd digits is:"+SumofOdd());



	}

	public static int SumofOdd(){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number till you want sum of odd numbers:");
		int lDigit=sc.nextInt();
		int sum=0;
		int i=0;
		while(i<=lDigit){

			if(i%2!=0){
				sum+=i;

			}

		i++;


		}

		return sum;

	}



}
