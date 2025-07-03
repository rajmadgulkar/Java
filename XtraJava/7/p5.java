import java.util.*;

class Demo{
	

	public static void CheckPRange(int start,int end){
		int j=start;
		while(j<=end){
			if(CheckPrime(j)){

				System.out.print(j+" ");

			}
			j++;
		}
	


	}
	
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
		Scanner in =new Scanner(System.in);

		System.out.println("Enter start:");
		int start=in.nextInt();
		System.out.println("Enter end:");
		int end=in.nextInt();

	
		CheckPRange(start,end);





	}

}
