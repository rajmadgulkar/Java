import java.util.*;
class prog13{
	public static void main(String[]args){
		System.out.println("Enter the choice:");
		Scanner sc=new Scanner(System.in);
		int courseId=sc.nextInt();

		if(courseId==1){
			System.out.println("Java Course");
			System.out.println("Java,DSA,DBMS,OS");
		}else if(courseId==2){
			
			System.out.println("Python Course");
			System.out.println("Python,IOT,ML,AI");
		}else if(courseId==3){
			
			System.out.println("Bootcamp Course");
			System.out.println("C,CPP,DSA");
		}else if(courseId==4){
			
			System.out.println("Flutter Course");
			System.out.println("Dart,Flutter");
		}else if(courseId==5){
			
			System.out.println("WebDev Course");
			System.out.println("HTML,CSS,Javascript,React JS");
		}else if(courseId==6){
			
			System.out.println("BackEnd Course");
			System.out.println("Adv Java,Springboot");
		}else{
			System.out.println("Invalid Input");
		}

	}

}
