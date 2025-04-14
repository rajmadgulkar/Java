import java.util.*;
class PEODemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int x;
        int sum=0;
        while(num>0){
            x=num%10;
            if(x%2==0){
                System.out.print(x+",");
            }else{
                System.out.print(x*x+",");
            }
            num=num/10;
        }
        System.out.println();
    }
}