import java.util.*;
class Address{
	String socName;
	char socWing;
	int flatNo;
	Address(String socName,char socWing,int flatNo){
		this.socName=socName;
		this.socWing=socWing;
		this.flatNo=flatNo;
	}
	void SocInfo(){

		System.out.println("Society Name:-"+socName);
		System.out.println("Society Wing:-"+socWing);
		System.out.println("Flat No:-"+flatNo);
	}

}
class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter society name:");
		String socName = sc.nextLine();
		System.out.print("Enter wing:");
		char socWing = sc.next().charAt(0);
		System.out.print("Enter flat no:");
		int flatNo = sc.nextInt();
		System.out.println("---------------------------");
		Address obj=new Address(socName,socWing,flatNo);
		obj.SocInfo();
	}
}
