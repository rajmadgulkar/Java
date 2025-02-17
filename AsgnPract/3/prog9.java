import java.util.*;

class WeekDay{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Input=");
		int weekDay=sc.nextInt();

		if(weekDay==1){

			System.out.println("Monday");
		}else if(weekDay==2){

			System.out.println("Tuesday");
		}else if(weekDay==3){

			System.out.println("Wednesday");
		}else if(weekDay==4){

			System.out.println("Thursday");
		}else if(weekDay==5){

			System.out.println("Friday");
		}else if(weekDay==6){

			System.out.println("Saturday");
		}else if(weekDay==7){

			System.out.println("Sunday");
		}else{

			System.out.println("Day number must be between 1 to 7!!!");
		}
	}

}
