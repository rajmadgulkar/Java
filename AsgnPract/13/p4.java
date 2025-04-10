
import java.util.Scanner;

class Nestedfor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:");
        int row=sc.nextInt();
        int num=1;
        for(int i=1;i<=row;i++){


            for(int sp=1;sp<=(row-i);sp++){
                System.out.print("\t");

            }
            for(int j=1;j<=(2*i-1);j++){

                if(i%2==0){
                    char ch1=(char)(96+j);
                    System.out.print(ch1+"\t");
                    ch1++;

                }else{
                    char ch2=(char)(64+j);
                    System.out.print(ch2+"\t");
                    ch2++;
                }

            }
            System.out.println();

        }

    }
}