/*import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                count++;
            }
        }
        System.out.println(count);
    }
}*/
import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        int max=0,count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
                count=1;
            } else if (arr[i]==max) {
                count++;
            }
        }
        System.out.println(count);
    }
}