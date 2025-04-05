import java.util.*;

class Demo{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of rows:");
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){

				if(i%3==0){
					System.out.print(" @ ");
				}else if(i%3==1){
					System.out.print(" # ");
				}else{
				
					System.out.print(" $ ");
				}

			}
			System.out.println();

		}





	}



}
