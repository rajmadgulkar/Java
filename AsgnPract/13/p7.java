import java.util.*;
class GeorgeWell{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:");
        int row=sc.nextInt();
        int i=1;
        char ch=(char)(64+row);
        for(;i<=row;i++){

            for(int k=1;k<=(i-1);k++){
                System.out.print("\t");
            }
            for(int j=1;j<=((row-i)*2+1);j++){
                System.out.print(ch+"\t");

            }
            ch--;
            System.out.println();
        }
    }
}