import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter rows:");
        int row=sc.nextInt();
        System.out.print("Enter columns:");
        int col=sc.nextInt();
        for(int i=0;i<=row;i++){
            int x=row;
            for(int j=1;j<=col;j++) {
                System.out.print(" "+row--+" ");
            }
            System.out.println();
        }
    }
}