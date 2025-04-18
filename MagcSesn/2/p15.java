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
        int sum=0;
        System.out.println("Output:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j%2==0) {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("sum:"+sum);


    }
}