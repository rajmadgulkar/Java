import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int freq[]=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            freq[arr[i]]++;
        }
        int pairs=0;
        for(int i=1;i<100;i++){
            pairs+=freq[i]/2;
        }
        System.out.println(pairs);
    }
}