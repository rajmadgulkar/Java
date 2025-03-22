import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter rows:");
        int rows=sc.nextInt();
        PrintPattern(rows);


    }

    public static void PrintPattern(int rows) {
        int x=1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                System.out.print(" "+x);
                x+=3;
            }
            System.out.println();
        }

    }
}