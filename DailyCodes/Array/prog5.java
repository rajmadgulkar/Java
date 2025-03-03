import java.io.*;

class ArrayDemo{
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of an array:");
		int size = Integer.parseInt(br.readLine());

		int arr[]= new int[size];

		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Array elements are:");
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}





	}




}
