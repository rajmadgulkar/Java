import java.util.*;
class BankAccount{
	double bankBalance;
	double withMoney;
	double depMoney;

	BankAccount(double bankBalance,double withMoney,double depMoney){
		this.bankBalance=bankBalance;
		this.withMoney=withMoney;
		this.depMoney=depMoney;
	}

	void withdraw(){
		System.out.println(" Withdrawing Money from your account with Balance:"+bankBalance);

	}
	void deposit(){
		System.out.println("Successfully deposited!"+(bankBalance+depMoney));

	}
}
class SavingsAccount extends BankAccount{
	SavingsAccount(double bankBalance,double withMoney,double depMoney){
		super(bankBalance,withMoney,depMoney);

	}
	void withdraw(){
		
		double dailyLimit=5000;
		
		if(withMoney>dailyLimit){
			System.out.println("Daily Limit Exceeded!");

		}else{
			System.out.println("Amount withdrawn successfully! Balance:"+(bankBalance-withMoney));
		}
	}

}
class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bank Balance:");
		double bankBalance=sc.nextDouble();
		
		System.out.print("Deposit Money:");
		double depMoney=sc.nextDouble();

		System.out.print("Withdraw Money:");
		double withMoney=sc.nextDouble();
		
		BankAccount obj = new SavingsAccount(bankBalance,depMoney,withMoney);	
		
		obj.deposit();
		

		obj.withdraw();
	}
}
