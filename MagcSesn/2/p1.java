import java.io.*;
class Demo{
    public static void main(String[] args) throws IOException{
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(isr);
        System.out.print("Enter String1:");
        String str1=br.readLine();
        System.out.print("Enter String2:");
        String str2=br.readLine();

        if(str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equal.");
        }else{
            System.out.println("Strings are not equal.");
        }

    }
}