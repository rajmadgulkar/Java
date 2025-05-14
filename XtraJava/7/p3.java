import java.util.*;

class Demo{
	public static int CheckPrime(int num){
	
		int count=0;
		
		int i=1;

		while(i<=num){
				if(num%i==0){
					count++;
				}
			i++;
		}
		return count;

	}

	public static void main(String[] args){
		Scanner in =new Scanner(System.in);	
		System.out.print("Enter a number:");
		int num=in.nextInt();

		if(CheckPrime(num)<=2){
			System.out.println(num+" is a prime number.");
		}else{
			System.out.println(num+" is a not prime number.");

		}

	}


}
