import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size:");
        int size=sc.nextInt();

        char chArr[]=new char[size];
        for(int i=0;i<size;i++){
            chArr[i]=sc.next().charAt(0);
        }
        for(int i=size-1;i>=0;i--){
            System.out.print(chArr[i]+" ");
        }
    }
}