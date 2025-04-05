import java.util.*;

class Demo{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of rows:");
		int row=sc.nextInt();
		int i=1;
		char ch=(char)(64+row);
		int x=i;
		for(;i<=row;i++){
			for(int j=1;j<=row;j++){

				if(i%2!=0){
					System.out.print(ch+" ");
					ch--;
				}else{
					System.out.print(x+" ");
					x++;
					
				}				

			}
			if(i%2!=0){
				ch+=row;
			}else{
				x-=row;
			}
			System.out.println();

		}





	}



}
