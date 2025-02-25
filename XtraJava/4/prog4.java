import java.util.*;

class Factorial{
	public static void main(String[]args){

		System.out.println("The factorial is:"+(Factorial()));




	}
	public static int Factorial(){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter a number to calculate its factorial:");
		int fact=sc.nextInt();
		int sum=1;
		int i=fact;
		while(i>=1){
			sum*=i;
			i--;
		}
		return sum;

	}

}
