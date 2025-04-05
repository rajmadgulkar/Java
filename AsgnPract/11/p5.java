import java.util.*;

class Demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows:");
		int row=sc.nextInt();
		int i=1;
		char ch=(char)(64+i);
		for(;i<=row;i++){
			for(int j=1;j<=i;j++){

				System.out.print(" "+ch+" ");
				ch++;
			


			}
			System.out.println();


		}





	}



}
