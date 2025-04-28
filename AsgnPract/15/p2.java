import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:");
        int row=sc.nextInt();
        int x=row;


        for(int i=1;i<=row;i++){
            int y=x;
            for(int j=1;j<=i;j++){

                System.out.print(y+"\t");
                y+=x;
            }
            x--;
            System.out.println();
        }
    }
}