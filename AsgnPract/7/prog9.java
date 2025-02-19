import java.util.*;


class SumOddRange{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter range from:");
		int num1=sc.nextInt();

		System.out.print("Enter range to:");
		int num2=sc.nextInt();
		int sum=0;

		int i=num1;
		while(i<=num2){


			if(i%2!=0){
				sum+=i;

			}
			i++;

		}
		System.out.println(sum);


	}





}
