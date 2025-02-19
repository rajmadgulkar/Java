import java.util.*;

class ClothCheck{

	public static void main(String[]args){


		Scanner sc=new Scanner(System.in);
		System.out.println("Input:");
		char ch=sc.next().charAt(0);
		//ch=Character.toUpperCase(ch);


		switch(Character.toUpperCase(ch)){
			case 'M':
				System.out.println("Medium");
				break;
			 
			case 'L':
				System.out.println("Large");
				break;
			
			case 'S':
				System.out.println("Small");
				break;
			default:
				System.out.println("Invalid Cloth Size");
				break;

		}
		
	}

}
