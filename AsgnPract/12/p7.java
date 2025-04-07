import java.util.*;

class Demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			int x=1;
			for(int j=1;j<=row;j++){
				
				if(j<=i-1){
					System.out.print("\t");

				}else{
					System.out.print("\t"+x);
					x++;

				}

			}
			x--;
			System.out.println();

		}
	}

}
