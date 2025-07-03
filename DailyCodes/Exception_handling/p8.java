
import java.util.*;
class UserInput{
	static void input(){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter player name:");
		String pName=sc.next();

		System.out.println("Enter player jersey no:");
		int jerNo=sc.nextInt();

		System.out.println("Enter the index:");
		int nameInd=-1;

		try{

			nameInd=sc.nextInt();

		}catch(NumberFormatException ie){
			
			System.out.println("Please enter valid index:");
			nameInd=sc.nextInt();

		}try{
			System.out.println(pName.charAt(nameInd));

		
		}catch(ArrayIndexOutOfBoundsException ae){
			
			System.out.println("Handle with Array index.");

		}catch(StringIndexOutOfBoundsException se){
			
			System.out.println("Handle with String index.");

		}

	}
	
	public static void main(String[] args){

		System.out.println("Start Main");

		input();
		System.out.println("End Main");



	}

}
