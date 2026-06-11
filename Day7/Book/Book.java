package Day7.Book;

public class Book implements Comparable<Book> {
    private int bookid;
    private String name,author;
    private double price;
    public Book(int bookid, String name, String author, double price) {
        this.bookid = bookid;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return "Book [bookid=" + bookid + ", name=" + name + ", author=" + author + ", price=" + price + "]";
    }

    public int compareTo(Book o) {

        if(this.bookid<o.bookid)
            return -1;
        else if(this.bookid>o.bookid)
            return 1;
        else
        return 0;
    }

}
