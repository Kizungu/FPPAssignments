package Lesson5;

public class Book {
    public int  TrackSales(){
        return 0;

    }
    public void quantityAvailable(){
        System.out.println();

    }
    private String id;
    private String bookCategory;
    private String author;
    private String title;
    private String publisher;
    private double sellingPrice;
    private int quantity;

    public Book(String id, String bookCategory, String author, String title, String publisher, double sellingPrice, int quantity) {
        this.id = id;
        this.bookCategory = bookCategory;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book ID: "+ id + "Book Category:" + bookCategory + "Book Author:" + author + "Book Title: " + title + "\n" +
                "Book Publisher:" + publisher + "Selling Price" + sellingPrice + "Availble Quantity:" + quantity;
    }
}
