import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int size=sc.nextInt();

        int [] arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("The largest element in the array is:"+largest);
    }
}