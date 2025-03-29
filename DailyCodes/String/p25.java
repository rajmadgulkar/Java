import java.util.*;
class DString{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmpId, EmpName, Salary, Location:");
		String info = sc.nextLine();
		StringTokenizer st= new StringTokenizer(info," ");

		System.out.println("Employee Id:"+st.nextToken());
		System.out.println("Employee Name:"+st.nextToken());
		System.out.println("Employee Salary:"+st.nextToken());
		System.out.println("Employee Location:"+st.nextToken());





	}



}
