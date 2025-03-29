import java.util.*;
class PassDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int row=sc.nextInt();

        for(int i=0;i<row;i++){
            char ch='A';

            for(int j=0;j<row;j++){
                System.out.print(" "+ch++ +" ");
            }
            System.out.println();
        }

    }
}