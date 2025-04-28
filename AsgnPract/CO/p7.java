import java.util.*;
class Mobile{
    String mobileBrand;
    int mobileModel;
    int batteryHrs;
    Mobile(String mobileBrand,int mobileModel,int batteryHrs){
        this.mobileBrand=mobileBrand;
        this.mobileModel=mobileModel;
        this.batteryHrs=batteryHrs;
    }
    void MobileInfo(){
        System.out.println("________________________________________");
        System.out.println("Brand:"+mobileBrand);
        System.out.println("Model:"+mobileModel);
        System.out.println("Battery:"+batteryHrs);
        System.out.println("________________________________________");

        if(checkBattery()){
            System.out.println("Battery Life is above average.");
        }else{
            System.out.println("Battery Life is below average.");
        }

    }
    boolean checkBattery(){
        int BatteryParameter=10;
        if(batteryHrs>=BatteryParameter){
            return true;
        }
        return false;
    }
}
class Client{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter mobile brand:");
        String mobileBrand=sc.nextLine();
        System.out.print("Enter mobile model:");
        int mobileModel=sc.nextInt();
        System.out.print("Enter battery hrs:");
        int batteryHrs=sc.nextInt();

        Mobile obj=new Mobile(mobileBrand,mobileModel,batteryHrs);
        obj.MobileInfo();


    }
}