import java.util.*;

class Demo{


	public static void main(String[] args){
	
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the count:");
		int count=sc.nextInt();
		
		int n1=0;
		int n2=1;
		int n3;
		System.out.print(n1+" ");
		System.out.print(n2);
		for(int i=1;i<=(count-2);i++){
			n3=n1+n2;	
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
		System.out.println();


	}


}
