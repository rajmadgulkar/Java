import java.util.*;
class CDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row:");
        int row=sc.nextInt();


        int space=0;
        int col=0;
        int i=1;
        char ch=(char)((64+row)+1);

        for(;i<=row*2-1;i++){

            if(i<=row){
                ch--;
                space=row-i;
                col=i*2-1;
            }else{
                ch++;
                space=i-row;
                col-=2;
            }
            for(int sp=1;sp<=space;sp++){
                System.out.print("\t");
            }
            for(int j=1;j<=col;j++){
                System.out.print(ch+"\t");
            }
            System.out.println();
        }
    }
}