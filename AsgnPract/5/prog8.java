import java.util.*;

class Test{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		System.out.print("num1:");
		int num1=sc.nextInt();

		System.out.print("num2=");
		int num2=sc.nextInt();
		
		if(num1>0&&num2>0){
			int mnum=num1*num2;

			switch(mnum%2){

				case 0:
					System.out.println(mnum+" is an even number.");
					break;
				default:
					
					System.out.println(mnum+" is an odd number.");
					break;


			}

		}else{
			
			System.out.println("Sorry negative numbers not allowed");

		}
	}

}
