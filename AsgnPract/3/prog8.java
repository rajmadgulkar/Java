import java.util.*;

class TestMD{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("num1=");
		int num1=sc.nextInt();
		System.out.print("num2=");
		int num2=sc.nextInt();

		if(num1>num2){
			System.out.println(num1+" is maximum between "+num1+","+num2);

		}else{

			System.out.println(num2+" is maximum between "+num1+","+num2);

		}



	}


}
