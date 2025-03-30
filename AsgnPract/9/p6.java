import java.util.*;

class ForDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of rows:");
        int row=sc.nextInt();
        int x=1;
        for(int i=1;i<=row;i++){

            for(int j=1;j<=row;j++){

                System.out.print(" "+ x++ +" ");

            }
            x--;
            System.out.println();
        }
    }
}