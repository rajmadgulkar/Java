import java.util.*;


class TestUL{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("ch=");
		char ch=sc.next().charAt(0);

		if(ch>=65&&ch<=90){
				System.out.println(ch+" is a UPPERCASE character.");

		}else{
				System.out.println(ch+" is a LOWERCASE character.");


		}


	}


}
