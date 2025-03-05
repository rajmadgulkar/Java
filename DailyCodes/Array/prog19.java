import java.io.*;
class AnotherMethod{
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter rows:");
		int row=Integer.parseInt(br.readLine());

		System.out.print("Enter columns:");
		int col=Integer.parseInt(br.readLine());
		
		int arr[][]=new int[row][col];

		
		System.out.println("Enter Array elements:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){

				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}

		System.out.println("The 2D array is:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){

				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		int lDSum=0;
		int rDSum=0;
		int tSum=0;
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){

				if(i==j){

					lDSum+=arr[i][j];
				}
			}
		}
		System.out.println("The left diagonal sum is:"+lDSum);


		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){

				
				if(i+j==row-1){

					rDSum+=arr[i][j];
				}
			}
		}
		System.out.println("The right diagonal sum is:"+rDSum);

		tSum=lDSum+rDSum;
		if(row%2==0){
			System.out.println("The diagonal sum is:"+tSum);
		}
		if(row%2!=0){
			int mod=row/2;

			tSum=tSum-arr[mod][mod];

			System.out.println("The diagonal sum after eliminating middle element is:"+tSum);
		}
	}



}
