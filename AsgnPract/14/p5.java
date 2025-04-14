import java.util.*;
class PrintNumDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int x;
        while(num>0){
            x=num%10;
            System.out.print(x+",");
            num=num/10;
        }
        System.out.println();
    }
}