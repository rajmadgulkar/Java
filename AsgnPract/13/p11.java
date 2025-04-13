import java.util.*;
class ZDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row:");
        int row=sc.nextInt();

        int space=0;
        int col=0;

        int x=0;

        for(int i=1;i<=row*2-1;i++){

            if(i<=row){
                x=i;
                space=row-i;
                col=i*2-1;
            }else{
                x--;
                space=i-row;
                col-=2;
            }
            for(int sp=1;sp<=space;sp++){
                System.out.print("\t");
            }
            for(int j=1;j<=col;j++){
                System.out.print(x+"\t");

            }

            System.out.println();
        }
    }
}