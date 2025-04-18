import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int size=sc.nextInt();

        String Sarr[]=new String[size];
        for(int i=0;i<size;i++){
            Sarr[i]=sc.next();
        }
        System.out.print("Enter search key:");
        String str=sc.next();
        for(int i=0;i<size;i++){
            if(str.equals(Sarr[i])){
                System.out.println("Found at index:"+i);
                break;
            }

        }
    }

}