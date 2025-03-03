import java.util.Scanner;

class ExT{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size= sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elements you need to search:");
        int num=sc.nextInt();

        int i=0;
        for (;i<size;i++){

            if(num==arr[i]){
                System.out.println(num+" is present.");
                break;
            }
        }
        if(i==size){
            System.out.println(num+" is not present.");
        }


    }



}