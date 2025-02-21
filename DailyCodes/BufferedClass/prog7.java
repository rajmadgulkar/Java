
import java.io.*;

class Test{
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Welcome");


		System.out.print("Enter Street Name:");
		String sName=br.readLine();

		System.out.print("Enter Lane:");
		char lName=br.readLine().charAt(0);
		//char lName=(char)br.read();
		//br.skip(1);
		System.out.print("Enter house Number:");
		int hNo=Integer.parseInt(br.readLine());

		System.out.print("Enter current house price:");
		float hPrice=Float.parseFloat(br.readLine());
		

		System.out.println("Property details:");

		System.out.println("Street name:"+sName);
		System.out.println("Lane name:"+lName);
		System.out.println("House Number:"+hNo);
		System.out.println("Current price:"+hPrice+"Lakhs");


	}



}
