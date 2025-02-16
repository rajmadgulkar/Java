import java.util.*;
class prog5{
	public static void main(String[]args){

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your CGPA");
		float Cgpa=sc.nextFloat();
		if(Cgpa>7.0){
		       	System.out.println("Eligible for placements!");
		}else{
			System.out.println("Not Eligible for placements!");
		}
	}
}
