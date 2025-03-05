import java.util.*;

class Angles{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st angle:");
		int angle1=sc.nextInt();
		System.out.println("Enter 2nd angle:");
		int angle2=sc.nextInt();
		System.out.println("Enter 3rd angle:");
		int angle3=sc.nextInt();
		boolean isValid=IsvalidTriangle(angle1,angle2,angle3);
		if(isValid){
			System.out.println("The triangle with angles "+angle1+" "+angle2+" "+angle3+" is a valid triangle.");
		}else {
			System.out.println("The triangle with angles "+angle1+" "+angle2+" "+angle3+" is an invalid triangle.");

		}





	}
	public static boolean IsvalidTriangle(int first,int second,int third){

		int sum=0;
		sum=first+second+third;
		if(sum==180){
			return true;
		}
		return false;
	}




}
