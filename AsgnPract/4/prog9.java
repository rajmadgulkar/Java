import java.util.*;

class SPCP{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Selling Price:");
		int SPrice=sc.nextInt();
		System.out.print("Enter the Cost Price:");
		int CPrice=sc.nextInt();

		if(SPrice>CPrice){

			System.out.println("Profit of "+(SPrice-CPrice));


		}else if(SPrice==CPrice){

			System.out.println("No Profit No Loss");


		}else{
			System.out.println("Loss of "+(CPrice-SPrice));


		}



	}


}
