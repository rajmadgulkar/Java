import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:");
        int row=sc.nextInt();
        System.out.print("Enter cols:");
        int col=sc.nextInt();

        int [][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                arr[i][j]=sc.nextInt();

            }
        }
        System.out.println("Output:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }


    }
}