import java.util.*;
class State{
    String stateName;
    String stateLanguage;
    String currentCM;

    State(String stateName,String stateLanguage,String currentCM){
        this.stateName=stateName;
        this.stateLanguage=stateLanguage;
        this.currentCM=currentCM;
    }
    void stateDetails(){
        System.out.println("------------------------------------------------");
        System.out.println("The name of the state is:"+stateName);
        System.out.println("The language of the state is:"+stateLanguage);
        System.out.println("The current CM of state is:"+currentCM);
    }


}

class Client{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the State:");
        String stateName=sc.nextLine();
        System.out.print("Enter language of state:");
        String stateLanguage=sc.nextLine();
        System.out.print("Enter current CM of state:");
        String currentCM=sc.nextLine();

        State obj=new State(stateName,stateLanguage,currentCM);
        obj.stateDetails();


    }
}