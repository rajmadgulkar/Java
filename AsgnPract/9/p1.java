import java.util.*;
class ForDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows:");
        int row=sc.nextInt();

        for(int i=0;i<row;i++){
            char x=(char)(96+row);
            for(int j=0;j<row;j++){
                System.out.print(" "+x--+" ");
            }
            System.out.println();
        }
    }
}