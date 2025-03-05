import java.util.*;
class CharacterInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st character:");
        char firstChar=sc.next().charAt(0);
        System.out.println("Enter the 2nd character:");
        char secondChar=sc.next().charAt(0);
        System.out.println("The difference is: "+Chardiff(firstChar,secondChar));
    }
    public static int Chardiff(char first,char second){
        if(first==second){
            return 0;
        }else{
            return second - first;
        }
    }

}