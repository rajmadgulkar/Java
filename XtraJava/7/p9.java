import java.util.*;

class Demo{
	

	public static boolean Armstrong(int num){

		int sum=0,last=0,temp,digit=0;
		temp=num;
		while(temp>0){
			digit++;
			temp=temp	/10;
		}
		temp=num;

		while(temp>0){

			last=temp%10;
			sum+=(Math.pow(last,digit));
			temp=temp/10;

		}

		if(sum==num){
			return true;
		}else{
			return false;
		}

	}

	public static void main(String[] args){

		Scanner  sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();

		if(Armstrong(num)){
			System.out.println("Armstrong");
		}else{

			System.out.println("Not Armstrong");
		}



	}


}
