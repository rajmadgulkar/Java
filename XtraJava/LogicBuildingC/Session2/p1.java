import java.util.*;

class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start:");
        int start=sc.nextInt();
        System.out.print("Enter End:");
        int end=sc.nextInt();
        p1(start,end);


    }

    public static void p1(int start,int end) {
        System.out.print("Output: ");
        int i=start;
        while(i<=end){
            if(i%2==0){
                System.out.print(" " +i*i*i);
            }else{
                System.out.print(" "+i);

            }
            i++;
        }
        System.out.println();
    }
}