import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start:");
        int start=sc.nextInt();
        System.out.print("Enter the end:");
        int end=sc.nextInt();
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%5==0){
                sum+=i;
            }
        }
        System.out.println("The sum is:"+sum);
    }
}
