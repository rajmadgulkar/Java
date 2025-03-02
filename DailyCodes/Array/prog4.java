import java.util.*;
class SGPA{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many semesters have you completed yet:");
        int sem=1;
        int arrSize=sc.nextInt();
        float arr[]=new float[arrSize];
        System.out.println("Enter the individual SGPA's:");
        for(int i=0;i<arrSize;i++){
            System.out.print("SGPA "+(sem++)+":");
            arr[i]=sc.nextFloat();
        }
        System.out.println("The SGPA's are as follows:");
        for(int i=0;i<arrSize;i++){
            System.out.println(arr[i]);
        }
    }
}