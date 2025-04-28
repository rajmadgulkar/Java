import java.util.*;
class Movie{
    String movieName;
    String movieGenre;
    float movieRating;

     Movie(String movieName,String movieGenre,float movieRating){
        this.movieName=movieName;
        this.movieGenre=movieGenre;
        this.movieRating=movieRating;
    }
    void movieInfo(){
        System.out.println("Movie name:"+movieName);
        System.out.println("Movie genre:"+movieGenre);
        System.out.println("Movie rating:"+movieRating);

        if(isHit()){
            System.out.println(movieName+" is a hit film.");
        }else{
            System.out.println(movieName+" is not a hit film.");
        }

    }
    boolean isHit(){
        float hitParameter=8.0f;
        if(movieRating>=hitParameter){
            return true;
        }
        return false;
    }
}
class Client{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter movie name:");
        String movieName=sc.nextLine();
        System.out.print("Enter movie genre:");
        String movieGenre=sc.nextLine();
        System.out.print("Enter movie rating:");
        float movieRating=sc.nextFloat();

        Movie obj=new Movie(movieName,movieGenre,movieRating);
        obj.movieInfo();


    }
}