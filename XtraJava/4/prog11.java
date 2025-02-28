import java.util.*;
class GCD{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int first=sc.nextInt();
        System.out.print("Enter second number:");
        int second=sc.nextInt();
        int gCd=gcd(first,second);
        System.out.println("The gcd of numbers is:"+gCd);


    }
    public static int gcd(int first,int second){
        int gcd=1;
        int i=2;


        while(i<=least(first,second)){

            if(first%i==0&&second%i==0){
                gcd=i;
            }
            i++;
        }
        return gcd;
    }
    public static int least(int first,int second){
        if(first<second){
            return first;
        }else{
            return second;
        }
    }


}