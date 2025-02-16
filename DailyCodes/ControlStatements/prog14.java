import java.util.*;
class prog14{
	public static void main(String[]args){
		System.out.println("Enter the choice:");
		Scanner sc=new Scanner(System.in);
		int courseId=sc.nextInt();

		switch(courseId){
			case 1:
				System.out.println("Java Course");
				break;
			case 2:
				System.out.println("Python Course");
				break;
			case 3:
				System.out.println("Bootcamp Course");
				break;
			case 4:
				System.out.println("Flutter Course");
				break;
			case 5:
				System.out.println("WebDev Course");
				break;
			case 6:
				System.out.println("Backend Course");
				break;
			default:
				System.out.println("Invalid Input");
				break;


		}

	}

}
