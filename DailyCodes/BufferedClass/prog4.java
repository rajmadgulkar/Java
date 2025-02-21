import java.io.*;

class UserIO{
	public static void main(String[]args)throws IOException{

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.print("Enter Number:");
		String num1=br.readLine();
		
		System.out.print("Enter Number:");
		String num2=br.readLine();


		System.out.println(num1+num2);
		




	}




}
