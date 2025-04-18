import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.next();

        StringBuffer str1=new StringBuffer(str);
        str1.reverse();
        str=str1.toString();
        System.out.println("The reversed string is:"+str);
    }
}