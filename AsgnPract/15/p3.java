import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row:");
        int row=sc.nextInt();


        for(int i=1;i<=row;i++){
            int x=i;
            for(int j=1;j<=i;j++){
                System.out.print(x+"\t");
                x+=i;
            }
            System.out.println();
        }
    }
}