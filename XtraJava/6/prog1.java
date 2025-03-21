import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        if(isMultiple(num)){
            System.out.println(num+" is a multiple of 3");
        }else{
            System.out.println(num+" is not a multiple of 3");
        }
        
    }
    public static boolean isMultiple(int num){
        if(num%3==0){
            return true;
        }
        else{
            return false;
	}
    }
}
