import java.util.*;

class Demo{
	public static void main(String[] args){

		Scanner obj= new Scanner(System.in);
		System.out.print("Enter number:");
		int num=obj.nextInt();
		
		System.out.print("Factors of "+num+" are");
		int i=1;
		while(i<=num){
			if(i==num){	
				System.out.print(i);
				break;	
			}
			if(num%i==0){
				System.out.print(i+",");	
			}
			i++;
		}
		

	}


}
