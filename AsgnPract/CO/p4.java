import java.util.*;
class Book{
    String bookTitle;
    String bookAuthor;
    float bookPrice;
    Book(String bookTitle,String bookAuthor,float bookPrice){
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;
        this.bookPrice=bookPrice;
    }
    void bookDetails(){
        System.out.println("The book's title is:"+bookTitle);
        System.out.println("The book's author is:"+bookAuthor);
        System.out.println("The book's price is:"+bookPrice);
        if(isExpensive()){
            System.out.println(bookTitle+ " is an expensive book.");
        }else{
            System.out.println(bookTitle+" is not an expensive book.");
        }
    }
    boolean isExpensive(){
        float price=1000;
        if(bookPrice>=price){
            return true;
        }
        return false;
    }
}
class Client{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book title:");
        String bookTitle=sc.nextLine();
        System.out.print("Enter Book Author:");
        String bookAuthor=sc.nextLine();
        System.out.print("Enter Book Price:");
        float bookPrice=sc.nextFloat();

        Book obj =new Book(bookTitle,bookAuthor,bookPrice);
        obj.bookDetails();

    }
}