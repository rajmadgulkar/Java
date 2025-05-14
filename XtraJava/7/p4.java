
import java.util.*;
class Demo{

	public static boolean CheckPrime(int num){
		
		if(num<2)	return false;

		for(int i=2;i<=Math.sqrt(num);i++){

			if(num%i==0){
				return false;
			}
		}
		
		return true;

	}



	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=in.nextInt();
		
		if(CheckPrime(num)){
			System.out.println("Prime");
		}else{

			System.out.println("Not Prime");
		}



	}


}
