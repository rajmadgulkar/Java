import java.util.*;

class Demo{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of rows:");
		int row=sc.nextInt();
		int i=1;
		int x=i;
		for(;i<=row;i++){
			
			for(int j=1;j<=row;j++){

				if(x%2!=0){

					System.out.print((x*x*x)+" ");
					x++;
				}else{
				
					System.out.print((x*x)+" ");
					x++;
				}
				

			}
			System.out.println();

		}





	}



}
