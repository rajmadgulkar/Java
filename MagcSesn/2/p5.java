import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String str=sc.next();
        StringBuffer str1=new StringBuffer(str);
        System.out.println("Original String:"+str1);
        System.out.print("Enter the position at which you need to enter the next string:");
        int pos=sc.nextInt();
        System.out.print("Enter the next String:");
        String str2=sc.next();
        str1.insert(pos,str2);
        System.out.println("Inserted String:"+str1);
    }
}