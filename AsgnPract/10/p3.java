import java.util.*;

class Demo{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of rows:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			int x=i;
			for(int j=1;j<=row;j++){
				System.out.print(x+" ");
				x+=row;
				

			}
			System.out.println();

		}





	}



}
