import java.util.*;
class Employee{
    int empId;
    String empName;
    double empSal;

    Employee(int empId,String empName,double empSal){
        this.empId=empId;
        this.empName=empName;
        this.empSal=empSal;
    }
    void empDetails(){
        System.out.println("The Employee ID is:"+empId);
        System.out.println("The Employee name is:"+empName);
        System.out.println("The Employee salary is:"+empSal);
        System.out.println("The yearly salary of "+empName+" is:"+calYear());
    }
    double calYear(){
        return empSal*12;
    }

}
class Client{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee Id:");
        int empId=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name:");
        String empName=sc.nextLine();
        System.out.print("Enter Employee Salary:");
        double empSal=sc.nextDouble();

        Employee obj=new Employee(empId,empName,empSal);
        obj.empDetails();



    }
}