import java.util.*;

class Demo{

	static void run(){
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter x:");
		int x= sc.nextInt();
		System.out.print("Enter y:");
		int y= sc.nextInt();

		try{
			System.out.println(x/y);

		}catch(ArithmeticException ae){
			
			System.out.println("Arithmetic Exception occurs!");
		}
		System.out.println("End Run");
	}


	static void fun(){
		
		System.out.println("Start fun");
		run();
		System.out.println("End fun");


	}

}
class Client{
	
	public static void main(String[] args){


	
		System.out.println("Start Main");
		Demo.fun();
		System.out.println("End Main");
		

	}


}
