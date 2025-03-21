import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start:");
        int start=sc.nextInt();
        System.out.print("Enter the end:");
        int end=sc.nextInt();
        System.out.println("Even:");
        for(int i=end;i>=start;i--){
            if(i%2==0){
                 System.out.println(i);
            }
        }
        System.out.println("Odd:");
        for(int i=start;i<=end;i++){
            if(i%2!=0){
                 System.out.println(i);
	    }
	}
    }
}
