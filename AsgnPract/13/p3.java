
import java.util.Scanner;

class NestedFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:");
        int row=sc.nextInt();
        int num=1;
        for(int i=1;i<=row;i++){

            for(int sp=1;sp<=(row-i);sp++){
                System.out.print("\t");

            }
            for(int j=1;j<=(2*i-1);j++){

                if(num==9){
                    System.out.print(num+"\t");
                    num+=2;

                }else{
                    System.out.print(num+"\t");
                    num+=2;
                }

            }
            System.out.println();

        }

    }
}