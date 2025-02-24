import java.util.*;

class LeapYear{
	public static void main(String[]args){

		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the year:");
		int leapYear=sc.nextInt();

	if(leapYear%400==0||leapYear%100!=0&&leapYear%4==0){
		System.out.println("Your year is a leap year.");
	}else{
		System.out.println("Your year is not a leap year.");
		}





	}


}
