import java.io.*;
class SumofDigits{

	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number:");
		int num=Integer.parseInt(br.readLine());
		int sum=0;
		int test;
		int i=num;
		while(i>0){
			test=i%10;
			sum+=test;
			i=i/10;

		}
		System.out.println("The sum of digits is: "+sum);

	}


}
