import java.util.*;

class IDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows:");
        int row=sc.nextInt();

        for(int i=0;i<row;i++){
            int x=1;
            char ch='A';
            for(int j=0;j<row;j++){
                System.out.print(" "+x++ +ch++ +" ");

            }
            System.out.println();
        }
    }
}