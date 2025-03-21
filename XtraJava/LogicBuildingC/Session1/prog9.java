import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();

        for(int i=rows;i>0;i--){

            for(int j=0;j<rows;j++){
                System.out.print(" "+ i +" ");
            }
            System.out.println();
        }
    }
}