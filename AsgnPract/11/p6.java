import java.util.*;

class Demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows:");
		int row=sc.nextInt();
		int i=1;
		for(;i<=row;i++){
			int x=row;
			for(int j=1;j<=i;j++){

				System.out.print(" "+x+" ");
				x+=row;
			


			}
			System.out.println();


		}





	}



}
