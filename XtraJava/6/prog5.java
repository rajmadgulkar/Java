import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows=sc.nextInt();
        int arr[][]=new int [rows][];
        for(int i=0;i<rows;i++){
            System.out.print("Enter number of columns for "+i +"th row:");
            int col=sc.nextInt();
            arr[i]=new int[col];
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            
        }
        System.out.println();
	}
    }
}
