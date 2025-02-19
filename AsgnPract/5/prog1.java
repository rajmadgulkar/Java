import java.util.*;


class TrafficS{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter traffic light colour:");
		String tSignal=sc.next();

		if(tSignal.equalsIgnoreCase("Red")){
			System.out.println("Stop");

		}else if(tSignal.equalsIgnoreCase("Yellow")){
			System.out.println("Slow down and wait");

		}else if(tSignal.equalsIgnoreCase("Green")){
			System.out.println("Go");

		}else{
			System.out.println("No such colour present in traffic lights");

		}

	}



}
