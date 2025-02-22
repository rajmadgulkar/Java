import java.io.*;

class SI{

	public static void main(String[]args)throws IOException{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	System.out.print("Enter Principal:");
	float sPrin=Float.parseFloat(br.readLine());

	System.out.print("Enter Time in yrs:");
	float sTime=Float.parseFloat(br.readLine());

	System.out.print("Enter Rate of interest:");
	float sRate=Float.parseFloat(br.readLine());

	float SimpleI=(float)(sPrin*sTime*sRate)/100;

	System.out.println("The Simple Interest: "+SimpleI);





	}



}
