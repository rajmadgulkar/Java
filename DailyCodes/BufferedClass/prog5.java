import java.io.*;

class Society{

	public static void main(String[]args)throws IOException{

		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.print("Enter Society Name:");
		String socName=br.readLine();

		System.out.print("Enter flat wing:");
		char socWing=br.readLine().charAt(0);

		System.out.print("Enter flat number:");
		int socNo=Integer.parseInt(br.readLine());

		System.out.print("Enter flat rent:");
		float socRent=Float.parseFloat(br.readLine());

		System.out.println(socName);
		System.out.println(socWing);
		System.out.println(socNo);
		System.out.println(socRent);






	}









}
