import java.util.*;
class George{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:");
        int row=sc.nextInt();
        int x=row;
        for(int i=1;i<=row;i++){

            for(int k=1;k<=(i-1);k++){
                System.out.print("\t");
            }
            for(int j=1;j<=((row-i)*2+1);j++){
                System.out.print(x+"\t");

            }
            x--;
            System.out.println();
        }
    }
}