import java.util.*;

class Demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows:");
		int row=sc.nextInt();

		for(int i=1;i<=row;i++){
			for(int sp=1;sp<=(row-i);sp++){
				System.out.print(" ");

			}
			for(int j=1;j<=(i*2-1);j++){
				System.out.print("*");

			}
			System.out.println();
		}

	}
}
