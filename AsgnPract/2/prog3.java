import java.util.*;


class LogicalOp{

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first boolean value(true/false):");
		boolean firstVal=sc.nextBoolean();

		System.out.print("Enter the second boolean value(true/false):");
		boolean secondVal=sc.nextBoolean();

		System.out.println("Logical AND: "+firstVal+"&&"+secondVal+"="+(firstVal&&secondVal));
		System.out.println("Logical OR: "+firstVal+"||"+secondVal+"="+(firstVal||secondVal));
		System.out.println("Logical NOT for the first value :"+"!"+firstVal+" = "+(!firstVal));
		System.out.println("Logical NOT for the second value :"+"!"+secondVal+" = "+(!secondVal));





	}


}
