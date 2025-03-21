import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        int z=1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                System.out.print(" "+ z +" ");
                z+=2;
            }

            System.out.println();
        }
    }
}