import java.util.*;
class IntArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of an array:");
        int arraySize=sc.nextInt();

        int arr[]=new int[arraySize];
        System.out.println("Enter array elements:");
        for(int i=0;i<arraySize;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is:");
        for (int i=0;i<arraySize;i++){
            System.out.println(arr[i]);
        }

    }
}