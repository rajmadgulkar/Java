import java.util.*;

class Demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){
				
				if(row%2==0){
					if(j<=i-1){
						System.out.print("\t");

					}else{
						char ch=(char)(64+j);
						if(j%2!=0){
							System.out.print("\t"+(int)(ch));
						}else{
							System.out.print("\t"+ch);
						}
					}
				}else{

					if(j<=i-1){
						System.out.print("\t");

					}else{

						char ch=(char)(64+j);
						if(j%2!=0){
							System.out.print("\t"+ch);
						}else{
							System.out.print("\t"+(int)(ch));
						}
					}


				}

			}
			System.out.println();

		}
	}

}
