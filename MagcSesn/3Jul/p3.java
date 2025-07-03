import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int arr[]=new int[n];
        int ret[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-d;i++){
            ret[i]=arr[d+i];
        }
        for(int i=0;i<d;i++){
            ret[n-d+i]=arr[i];
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println("");
        for (int i=0;i<n;i++){
            System.out.print(ret[i]);
        }
    }
}