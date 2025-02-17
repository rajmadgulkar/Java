import java.util.*;


class myDream{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary:");
		float mSal=sc.nextFloat();
		
		System.out.print("Things to buy in 5 years:");
		if(mSal>=400000&&mSal<1000000){

			System.out.println("Car");


		}else if(mSal>=1000000&&mSal<1500000){
			System.out.println("Flat");


		}else if(mSal>=1500000&&mSal<2000000){
			System.out.println("Business In Pune");


		}else if(mSal>=2000000&&mSal<2500000){
			System.out.println("Villa");


		}else{
			System.out.println("Continue Progressing");


		}



	}


}
