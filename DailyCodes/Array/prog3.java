
import java.util.*;
class WeekDaysArr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int arraySize=sc.nextInt();
        String arr[]=new String[arraySize];
        System.out.println("The weekdays are:");
        for (int i=0;i<arraySize;i++){
            arr[i]=sc.next();
        }
        System.out.println("The weekdays array is:");
        for (int i=0;i<arraySize;i++){
            System.out.println(arr[i]);
        }
    }
}