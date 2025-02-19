import java.util.*;


class Sum45{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter range from:");
		int num1=sc.nextInt();

		System.out.print("Enter range to:");
		int num2=sc.nextInt();
	

		int i=num1;
		while(i>=num2){


			if(i%4==0&&i%5==0){
						
				System.out.println(i);

			}
			i--;
		}


	}





}
