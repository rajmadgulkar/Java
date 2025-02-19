import java.util.*;

class GradeSwitch{

	public static void main(String[]args){


		Scanner sc=new Scanner(System.in);
		System.out.println("Input:");
		char ch=sc.next().charAt(0);
		//ch=Character.toUpperCase(ch);


		switch(Character.toUpperCase(ch)){
			case 'O':
				System.out.println("Outstanding");
				break;
			 
			case 'A':
				System.out.println("Excellent");
				break;
			
			case 'B':
				System.out.println("Good");
				break;

			case 'C':
				System.out.println("Average");
				break;

			default:
				System.out.println("Fail");
				break;

		}
		
	}

}
