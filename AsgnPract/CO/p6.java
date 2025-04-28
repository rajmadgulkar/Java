import java.util.*;
class Laptop{
    String lpBrand;
    String lpProcessor;
    float lpRam;

    Laptop(String lpBrand,String lpProcessor,float lpRam){
        this.lpBrand=lpBrand;
        this.lpProcessor=lpProcessor;
        this.lpRam=lpRam;
    }
    void lpSpecs(){
        System.out.println("____________________________________________");
        System.out.println("Brand:"+lpBrand);
        System.out.println("Processor:"+lpProcessor);
        System.out.println("RAM:"+lpRam);

        System.out.println("____________________________________________");
        if(checkRam()){
            System.out.println("Suitable for Gaming.");
        }else{
            System.out.println("Not Suitable for Gaming.");
        }
    }
    boolean checkRam(){
        float ramParameter=8.0f;
        if(lpRam>=ramParameter){
            return true;
        }
        return false;
    }
}
class Client{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter laptop brand:");
        String lpBrand=sc.nextLine();
        System.out.print("Enter laptop Processor:");
        String lpProcessor=sc.nextLine();
        System.out.print("Enter laptop RAM:");
        float lpRam=sc.nextFloat();

        Laptop obj=new Laptop(lpBrand,lpProcessor,lpRam);
        obj.lpSpecs();

    }
}