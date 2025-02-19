import java.util.*;


class CountOdd{
	public static void main(String[]args){


		Scanner sc=new Scanner(System.in);
		System.out.print("N=");
		int num=sc.nextInt();
		int count=0;

		for(int i=1;i<=num;i++){

			if(i%2!=0){

				count++;

			}


		}
		System.out.println(count);



	}



}
