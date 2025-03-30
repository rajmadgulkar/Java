import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows:");
        int row=sc.nextInt();

        int x=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){

                if(x%2!=0) {
                    System.out.print(" "+(x*x)+" ");
                    x++;
                }else{
                    System.out.print(" "+x+" ");
                    x++;
                }

            }
            System.out.println();
        }
    }
}