import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows:");
        int row=sc.nextInt();

        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= row; j++) {
                System.out.print((i + (j - 1) * row) + " ");
            }
            System.out.println();
        }
    }
}