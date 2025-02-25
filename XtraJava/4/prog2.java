import java.util.*;

class Table{
	public static void main(String[]args){

		Table();


	}
	public static void Table(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number you want print its table:");
		int dTable=sc.nextInt();
		
		int i=1;
		while(i<=10){

			System.out.println(dTable +" X "+i+" = "+(dTable*i));
			i++;

		}




	}




}
