import java.util.*;
class ArraySolution{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter an element you need to search:");
		int eleMent=sc.nextInt();

		boolean flag = false;

		for(int i=0;i<size;i++){

			if(eleMent==arr[i]){

				flag=true;
				break;
			}
		}
		
		if(flag){

			System.out.println("Present");

		}else{

			System.out.println("Not Present");

		}




	}



}
