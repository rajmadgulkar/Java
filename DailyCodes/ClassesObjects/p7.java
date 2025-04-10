class Company{
	String cmpName = "Microsoft";
	String cmpLoc = "Pune";

	void cmpInfo(){
		System.out.println(cmpName);
		System.out.println(cmpLoc);
	}
}
class Employee extends Company{
	String empName="Rahul";
	double empSal=2.5;

	void empInfo(){
		System.out.println(empName);
		System.out.println(empSal);

	}

}
class Client{
	public static void main(String[] args){
		Company cmp=new Company();
		cmp.cmpInfo();

		Employee emp = new Employee();
		emp.empInfo();
		emp.cmpInfo();




	}

}
