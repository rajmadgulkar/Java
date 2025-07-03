import java.util.*;
class Demo{

	public static boolean Armstrong(int num){
		int temp,last=0,digit=0,sum=0;
		temp=num;

		while(temp>0){
			digit++;
			temp=temp/10;
		}
		temp=num;

		while(temp>0){
			last=temp%10;
			sum+=(Math.pow(last,digit));
			temp=temp/10;

		}
		if(num==sum){
			return true;
		}else{
			return false;
		}

	}
	

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		

		System.out.print("Enter start:");
		int start=sc.nextInt();

		System.out.print("Enter end:");
		int end=sc.nextInt();

		for(int i=start;i<=end;i++){
			
			if(Armstrong(i)){
				System.out.println(i);

			}

		}








	}


}
