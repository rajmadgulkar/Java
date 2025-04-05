import java.util.*;

class Demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows:");
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++){
			int x=1;
			for(int j=1;j<=(row-i+1);j++){

				System.out.print(x+" ");
				x++;
			


			}
			System.out.println();


		}





	}



}
