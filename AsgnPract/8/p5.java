import java.util.*;
class FDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int row=sc.nextInt();
        int x=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print(" "+x+" ");
            }
            System.out.println();
        }

    }
}