import java.util.*;

class Demo{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter rows:");
		int row=sc.nextInt();
		System.out.print("Enter columns:");
                int col=sc.nextInt();
		int x=1;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				
				System.out.print(" "+x+" ");

                	}
			System.out.println();

		}



	}

}
