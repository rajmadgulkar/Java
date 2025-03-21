import java.io.*;
class Demo{
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.print("Enter start:");
        int start = Integer.parseInt(br.readLine());
        System.out.print("Enter end:");
        int end = Integer.parseInt(br.readLine());

        System.out.print("Output: ");
        for(int i=end;i>=start;i--){

            if(i%3==0&&i%7==0){
                System.out.print(i+ " ");
            }

        }
        System.out.println();



    }


}