import java.util.*;


class Traffic2{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter traffic light colour:");
		String tSignal=sc.next();

		if(tSignal.equals("Red")){
			System.out.println("Stop");

		}else if(tSignal.equals("Yellow")){
			System.out.println("Slow down and wait");

		}else if(tSignal.equals("Green")){
			System.out.println("Go");

		}else{
			System.out.println("No such colour present in traffic lights");

		}

	}



}
