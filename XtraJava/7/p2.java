import java.util.*;

class Demo{

	public static void fibo(int n1,int n2, int count){
		
		
		if(count>2){
			int n3=n1+n2;
			System.out.print(" "+n3);
		
			fibo(n2,n3,count-1);
		}

	}



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter count:");
		int count = sc.nextInt();

		int n1=0;
		int n2=1;
		if(count >=1)	System.out.print(n1+" ");
		if(count >=2) 	System.out.print(n2);
		
		fibo(n1,n2,count);


	}

}
