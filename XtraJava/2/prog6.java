import java.io.*;

class CI{

	public static void main(String[]args)throws IOException{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	System.out.print("Enter Principal:");
	float sPrin=Float.parseFloat(br.readLine());

	System.out.print("Enter Time in yrs:");
	float sTime=Float.parseFloat(br.readLine());

	System.out.print("Enter Rate of interest:");
	float sRate=Float.parseFloat(br.readLine());

	float CompoundI=(float)(sPrin*(1+(sRate/100))*sTime);

	System.out.println("The Compound Interest: "+CompoundI);





	}



}
