import java.util.*;

class Test2510{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("num=");
		int num=sc.nextInt();

		if((num%2==0 && num%5==0)&&num%10==0){
			System.out.println(num+" is divisible by 2,5,10.");

		}else{

			System.out.println(num+" is Not divisible by 2,5,10.");

		}



	}


}
