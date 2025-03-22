import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:");
        int rows=sc.nextInt();
        char ch='a';
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){

                if(j%2!=0) {
                    System.out.print(" " + ch);
                    ch++;
                }
                System.out.println(" "+ch);
                ch++;

            }
            System.out.println();
        }

    }
}