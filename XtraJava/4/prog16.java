import java.util.Scanner;

class Armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num:");
        int num=sc.nextInt();
        boolean AAmstrong=isArmstrong(num);
        if(AAmstrong){
            System.out.println(num +" is Armstrong number");
        }else{
            System.out.println(num+ " is not an Armstrong number");
        }

    }
    public static boolean isArmstrong(int num){
        int digits =noofDigits(num);
        int finalno=0;
        int numcpy=num;
        while(num>0){
            int lastdigit=num%10;
            num/=10;
            finalno+=pow(lastdigit,digits);
        }
        return finalno==numcpy;
    }
    public static int noofDigits(int num){
        int digits=0;
        while(num>0){
            digits++;
            num/=10;
        }
        return digits;
    }
    public static int pow(int num1,int num2){
        int result = 1;
        int i=0;

        while(i<num2){
            result*=num1;
            i++;
        }
        return result;
    }

}