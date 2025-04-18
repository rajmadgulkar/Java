import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String str1=sc.next();

        StringBuffer str=new StringBuffer(str1);
        str.reverse();
        String str2=str.toString();

        if(str1.equals(str2)){
            System.out.println(str1+" is a palindrome string.");
        }else{
            System.out.println(str1+" is not a palindrome string.");
        }


    }
}