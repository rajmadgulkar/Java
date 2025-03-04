//Practical 01
import java.util.*;
class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year to check if it is a leap year:");
        int year = sc.nextInt();

        isLeapYear(year);


    }

    public static void isLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}