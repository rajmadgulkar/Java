import java.util.*;

class Cal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        int sum=0;
        float average=0;
        for (int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println("The sum is "+sum);
        System.out.println("The average is "+(float)(sum/size));
    }

}