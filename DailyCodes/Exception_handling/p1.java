//IOException
import java.io.*;
class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter company name:");
		String cmp=br.readLine();
		System.out.println("Company Name:"+cmp);


		br.close();

		System.out.println("Enter company name:");
		String cmp22=br.readLine();
		System.out.println("Company Name:"+cmp);






	}

}
