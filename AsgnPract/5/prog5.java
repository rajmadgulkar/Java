import java.util.*;

class Grade{

	public static void main(String[]args){


		Scanner sc=new Scanner(System.in);
		System.out.println("Input:");
		char ch=sc.next().charAt(0);
		ch=Character.toUpperCase(ch);

		if(ch=='O'){
			System.out.println("Outstanding");

		}else if(ch=='A'){

			System.out.println("Excellent");

		
		}else if(ch=='B'){

			System.out.println("Good");


		}else if(ch=='C'){

			System.out.println("Average");
		}else if(ch=='D'){


			System.out.println("Below Average");
		}else{

			System.out.println("Fail");


		}
	}

}
