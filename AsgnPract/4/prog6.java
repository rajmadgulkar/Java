import java.util.*;

class PercentCheck{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the percentage:");
		float percentC=sc.nextFloat();

		if(percentC>85){
			System.out.println("Medical.");

		}else if(percentC<=85&&percentC>75){
			System.out.println("Engineering.");


		}else if(percentC<=75&&percentC>=65){ 
			System.out.println("Pharmacy or bachelor in Science.");


		}



	}


}
