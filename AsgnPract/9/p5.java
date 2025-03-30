import java.util.*;

class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows:");
        int row=sc.nextInt();

        char ch=(char)(64+row);
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print(" "+ ch+" ");
            }
            ch--;
            System.out.println();
        }
    }
}