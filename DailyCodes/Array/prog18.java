import java.io.*;
class ArrayPractice1{
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter rows:");
		int row=Integer.parseInt(br.readLine());

		System.out.print("Enter columns:");
		int col=Integer.parseInt(br.readLine());

		int arr[][]=new int[row][col];

		System.out.println("Enter array elements:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]=Integer.parseInt(br.readLine());
			}

		}

		System.out.println("Array elements are:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();

		}
		int sum1=0;

		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(i==j){
					sum1+=arr[i][j];
				}
			}

		}
		int sum2=0;

		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(i!=j){
					if(i+j==row-1){
						sum2+=arr[i][j];
					}
				}
			}

		}
		System.out.println("The sum of Left & Right diagonal is: "+(sum1+sum2));






	}





}
