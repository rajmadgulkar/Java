//Setter & Getter

import java.util.*;
class User{
	int empId;
	String empName;
	
	void empInfo(int empId,String empName){
		System.out.println(this.empId);
		System.out.println(this.empName);
		
		this.empId=empId;
		this.empName=empName;

		System.out.println(this.empId);
		System.out.println(this.empName);


	}
	User(int empId,String empName){

		this.empId=empId;
		this.empName=empName;
	}
	

}
class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id:");
		int empId=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee name:");
		String empName=sc.nextLine();
		
			
		User obj=new User(empId,empName);
		obj.empInfo(10,"Raj");

	}

}
