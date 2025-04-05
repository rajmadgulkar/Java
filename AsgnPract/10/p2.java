import java.util.*;

class Demo{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of rows:");
		int row=sc.nextInt();
		int x=(row*row)+row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(x--+" ");
					

			}
			System.out.println();

		}





	}



}
