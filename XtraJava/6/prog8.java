import java.util.*;

class LCM{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int first=sc.nextInt();
		System.out.print("Enter the second number:");
		int second=sc.nextInt();


		System.out.println("The LCM is:"+LCM(first,second));





	}
	public static int LCM(int first,int second){

		int i=1;
		int mul=0;
		while(i<second){

			mul=first*i;
			if(mul%second==0){

				return mul;

			}
			i++;



		}

		return first*second;


	}


}
