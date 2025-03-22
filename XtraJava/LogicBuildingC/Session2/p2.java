import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a special character:");
        char ch=sc.next().charAt(0);
        TypeReturn(ch);

    }

    public static void TypeReturn(char ch) {

        if(ch>=65&&ch<=90 || ch>=97&&ch<=122){
            System.out.println(ch+ " is an alphabet.");
        }else if(ch>=48&&ch<=56){
            System.out.println(ch+ " is a digit.");
        }else{
            System.out.println(ch+ " is a special character.");
        }
    }
}