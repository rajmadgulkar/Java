import java.util.*;

class Demo{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int size=sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            System.out.println(arr[i]+"="+arr[i]*(arr[i]-1)/2);
        }

    }


}
