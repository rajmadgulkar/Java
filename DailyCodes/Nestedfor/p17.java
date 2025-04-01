import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Number of rows:");
        int row=obj.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){

                if(j<=i-1) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}