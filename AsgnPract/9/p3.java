import java.util.*;
class ForDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows:");
        int row=sc.nextInt();
        for(int i=0;i<row;i++){
            char ch=(char)(49+i);
            for(int j=0;j<row;j++){
                System.out.print(" "+ch++ +" ");
            }
            System.out.println();
        }
    }
}