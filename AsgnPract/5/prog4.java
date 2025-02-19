import java.util.*;

class TSignal{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the colour:");
		String sColour=sc.next();

		switch(sColour){

			case ("Red"):
				System.out.println("Stop");
				break;

			case "Yellow":
				System.out.println("Stop & Wait");
				break;

			case "Green":
				System.out.println("Go");
				break;
			default:
			       	System.out.println("No such colour");
				break;
			

		}

	}

}
