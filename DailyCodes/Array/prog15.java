import java.util.*;

class ArrD{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter rows:");
		int rows=sc.nextInt();
		System.out.print("Enter columns:");
		int columns=sc.nextInt();
		
		int arr[][]=new int [rows][columns];

		System.out.println("Enter array elements:");
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){

				arr[i][j]=sc.nextInt();

			}
		}
		
		System.out.println("The array is:");
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){

				
				
				System.out.print(arr[i][j]);

			}
			
			System.out.println();
		}
		
		

	}





}
