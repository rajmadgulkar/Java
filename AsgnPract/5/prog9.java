import java.util.*;

class GradeCheck{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("English:");
		int eMarks=sc.nextInt();
		
		System.out.print("Science:");
		int sMarks=sc.nextInt();

		System.out.print("Maths:");
		int mMarks=sc.nextInt();

		System.out.print("History:");
		int hMarks=sc.nextInt();

		System.out.print("Geography:");
		int gMarks=sc.nextInt();

		if(eMarks>=35&&sMarks>=35&&mMarks>=35&&hMarks>=35&&gMarks>=35){

			int addMarks=(eMarks+sMarks+mMarks+hMarks+gMarks);

			switch(addMarks/100){
				case 2:
					System.out.println("Second class");
					break;
				
				case 3:
					System.out.println("First Class.");
					break;
				case 4:
					System.out.println("First Class with distinction.");
					break;
			}

		}else{
			System.out.println("You have failed the exam.");
		}

	}
}

