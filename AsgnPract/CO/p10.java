import java.util.*;
class City{
    String cityName;
    String cityState;
    int cityPopulation;
    City(String cityName,String cityState,int cityPopulation){
        this.cityName=cityName;
        this.cityState=cityState;
        this.cityPopulation=cityPopulation;
    }
    void cityInfo(){
        System.out.println("_________________________________");
        System.out.println("City Name:"+cityName);
        System.out.println("City State:"+cityState);
        System.out.println("City Population:"+cityPopulation);
        System.out.println("_________________________________");
        if(checkMetroCity()){
            System.out.println(cityName+" is a Metro city.");
        }else{
            System.out.println(cityName+" is not a Metro city.");
        }
    }
    boolean checkMetroCity(){
        int checkParameter=1000000;
        if(cityPopulation>checkParameter){
            return true;
        }
        return false;
    }

}
class Client{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter city name:");
        String cityName=sc.nextLine();
        System.out.print("Enter city state:");
        String cityState=sc.nextLine();
        System.out.print("Enter city population:");
        int cityPopulation=sc.nextInt();

        City obj=new City(cityName,cityState,cityPopulation);
        obj.cityInfo();
    }
}