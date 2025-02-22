import java.io.*;


class Swap{

	public static void main(String[]args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the first number:");
		int num1=Integer.parseInt(br.readLine());
		
		System.out.print("Enter the second number:");
		int num2=Integer.parseInt(br.readLine());

		System.out.println("The first number is "+num1);
		System.out.println("The second number is "+num2);

		int temp=num1;
		num1=num2;
		num2=temp;

		System.out.println("The Swapped values of num1 is "+(num1)+ " & num2 is "+(num2));

		//System.out.println(num1);
		//System.out.println(num2);



	}



}
