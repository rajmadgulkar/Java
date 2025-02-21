import java.io.*;

class CHW{
	public static void main(String[]args)throws IOException{

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Enter Company Name:");
		String cmpName=br.readLine();

		System.out.print("Enter company location:");
		String cmpLoc=br.readLine();
		
		System.out.print("Enter employee count:");
		int cmpEmp=Integer.parseInt(br.readLine());

		System.out.print("Enter average salary:");
		float cmpSal=Float.parseFloat(br.readLine());


		System.out.println(cmpName);
		System.out.println(cmpLoc);
		System.out.println(cmpEmp);
		System.out.println(cmpSal);



	}



}
