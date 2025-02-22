import java.io.*;

class AreaofT{

	public static void main(String[]args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter breadth:");
	float bT=Float.parseFloat(br.readLine());
	
	//int bT=br.read();
	System.out.print("Enter height:");
	float hT=Float.parseFloat(br.readLine());


	//System.out.println(bT);
	//System.out.println(hT);
	float areaT=(float)(0.5)*(bT*hT);

	System.out.println("The area of Triangle is: "+areaT);





	}



}
