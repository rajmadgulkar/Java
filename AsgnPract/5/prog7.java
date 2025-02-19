import java.util.*;

class Cloth{

	public static void main(String[]args){


		Scanner sc=new Scanner(System.in);
		System.out.println("Input:");
		char ch=sc.next().charAt(0);
		ch=Character.toUpperCase(ch);

		if(ch=='S'){
			System.out.println("Small");

		}else if(ch=='M'){

			System.out.println("Medium");

		
		}else if(ch=='L'){

			System.out.println("Large");


		}else{

			System.out.println("Invalid Cloth Size");


		}
	}

}
