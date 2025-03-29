import java.io.*;


class Demo{
	public static void main(String[]args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.print("Enter number of rows:");
		int rows=Integer.parseInt(br.readLine());

		for(int i=0;i<rows;i++){
			for(int j=0;j<rows;j++){

				System.out.print(" $ ");

			}
				System.out.println();

		}		





	}


}
