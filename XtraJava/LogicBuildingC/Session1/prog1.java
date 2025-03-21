import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start:");
        int start=sc.nextInt();
        System.out.print("Enter End:");
        int end=sc.nextInt();
        System.out.print("Output:");
        for(int i=start;i<end;i++){

            if(i%2!=0){
                System.out.print(i*i+" ");
            }
        }
        System.out.println();
    }
}