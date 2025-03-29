import java.util.*;
class ForDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String str=sc.next();
        System.out.print("Enter Number of rows:");
        int row=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print(" "+str+" ");
            }
            System.out.println();
        }

    }
}