import java.util.*;

class Test37{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("num=");
		int num=sc.nextInt();

		if(num%3==0){
			System.out.println(num+" is divisible by 3");

		}else if(num%7==0){

			System.out.println(num+" is divisible by 7.");
		}else{

			System.out.println(num+" is neither divisible by 3 nor 7.");

		}



	}


}
