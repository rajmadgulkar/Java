import java.util.*;

class Av{
	public static void main(String[]args){

		Scanner sc =new Scanner(System.in);

		System.out.print("Enter the size:");
		float size=sc.nextFloat();
		
		float arr[]=new float[(int)size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextFloat();
		}

		int sum=0;

		for(int i=0;i<size;i++){
			sum+=arr[i];

		}
		System.out.println("The sum is: "+sum);
		float average=sum/size;
		System.out.println("The average is: "+average);





	}



}
