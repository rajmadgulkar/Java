import java.io.*;


class Numcheck{

	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a Number:");
		int num=Integer.parseInt(br.readLine());

		if(num>0){
			System.out.println(num+" is a positive number.");

		}else if(num<0){

			System.out.println(num+" is a negative number.");


		}else{

			System.out.println(num+" is zero.");


		}





	}





}
