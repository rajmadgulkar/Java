import java.util.*;
class PDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int row=sc.nextInt();

        for(int i=1;i<=row;i++){
            int x=row;
            for(int j=1;j<=row;j++){
                System.out.print(" "+x-- +" ");
            }
            System.out.println();
        }

    }
}