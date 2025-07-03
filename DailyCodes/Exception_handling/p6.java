import java.io.*;


class Demo{

	void fillDetails(int empId, String empName, String empAddress){
		
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Address"+empAddress);


	}



}
class Client{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Demo employee = new Demo();

		System.out.print("Enter Employee Id:");
		int empId=Integer.parseInt(br.readLine());
		
		System.out.print("Enter Employee Name:");
		String empName=br.readLine();
		
		System.out.print("Enter Employee Address:");
		String empAddress=br.readLine();
		employee.fillDetails(empId, empName, empAddress);

	}




}
