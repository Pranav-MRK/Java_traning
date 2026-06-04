package Day3;

public class Book {
    int bookNo;
    String book_Name;
    String authour_Name;
    double price;
    
    public void NewBook(int id,String bn,String an,double p){
        bookNo=id;
        book_Name =bn;
        authour_Name=an;
        price =p;
        System.out.println("Entering book details:");

    }
    public void Display(){
        System.out.println("---------------Displaying Book Details----------");
        System.out.println(bookNo);
        System.out.println(book_Name);
        System.out.println(authour_Name);
        System.out.println(price);
    }
}
