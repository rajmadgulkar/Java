import java.util.*;

class Demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row:");
		int row=sc.nextInt();
		int i=1;
		for(;i<=row;i++){
			int y=1;
			int x=row;
			for(int j=1;j<=row;j++){
				
				if(j<=row-i){
					System.out.print("\t");

				}else{
					System.out.print("\t"+x*y);
					y++;

				}

			}
			System.out.println();

		}
	}

}
