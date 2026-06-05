package Assigment.Ques4;

public class Book {
    private String bname, author;
    private int price, id;

    public Book() {
        System.out.println("Called the default constructor...");
    }

    public Book(String bname, String author, int price, int id) {
        this.bname = bname;
        this.author = author;
        this.price = price;
        this.id = id;
    }

    public void display() {
        System.out.println("Book Name: " + bname);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("ID: " + id);
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
