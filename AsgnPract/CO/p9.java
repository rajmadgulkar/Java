import java.util.*;
class BankAccount{
    Scanner sc = new Scanner(System.in);
    int accountNumber;
    String accountHoldername;
    double accountBalance;

    BankAccount(int accountNumber,String accountHoldername,double accountBalance){
        this.accountNumber=accountNumber;
        this.accountHoldername=accountHoldername;
        this.accountBalance=accountBalance;
    }
    void dispbankInfo(){
        chooseOption();
        System.out.println("___________________________________");
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Account Holder name:"+accountHoldername);
        System.out.println("Account Balance:"+accountBalance);
        System.out.println("___________________________________");

    }

    void chooseOption(){
        System.out.print("1. Deposit Money\n2. Withdraw Money:");
        int chooseParameter=sc.nextInt();
        switch(chooseParameter){
            case 1:
                DepositMoney();
                break;
            case 2:
                WithdrawMoney();
                break;
            default:
                System.out.println("Invalid Option");
        }
    }

    void DepositMoney(){
        System.out.print("Enter amount to deposit:");
        double depAmount=sc.nextDouble();
        accountBalance=accountBalance+depAmount;
    }
    void WithdrawMoney(){
        System.out.print("Enter amount to withdraw:");
        double withAmount=sc.nextDouble();
        accountBalance=accountBalance-withAmount;
    }
}

class Client{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number:");
        int accountNumber=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder name:");
        String accountHoldername=sc.nextLine();
        System.out.print("Enter account balance:");
        double accountBalance=sc.nextDouble();

        BankAccount obj=new BankAccount(accountNumber,accountHoldername,accountBalance);
        obj.dispbankInfo();
    }
}