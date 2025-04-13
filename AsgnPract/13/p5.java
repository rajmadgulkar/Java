import java.util.*;
class Demofor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:");
        int row=sc.nextInt();
        System.out.print("Enter number to start from:");
        int num=sc.nextInt();
        System.out.print("Enter number to increase by:");
        int num2=sc.nextInt();

        int i=1;
        for(;i<=row;i++) {
            for(int k=1;k<=(i-1);k++){
                System.out.print("\t");
            }
            for(int j=1;j<=((row-i)*2)+1;j++) {
                System.out.print(num + "\t");
                num+=num2;
            }
            System.out.println();
        }
    }
}