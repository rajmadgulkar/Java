import java.io.*;

class UserInput{
	public static void main(String[]args)throws IOException{

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.print("Enter Number:");
		int num=Integer.parseInt(br.readLine());

		System.out.println(num);




	}




}
