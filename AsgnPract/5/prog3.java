import java.util.*;

class TSignal{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the colour:");
		String sColour=sc.next();

		switch(sColour){

			case "Red"->System.out.println("Stop");
			case "Yellow"->System.out.println("Stop & Wait");
			case "Green"->System.out.println("Go");
			default-> System.out.println("No such colour");
			






		}






	}





}
