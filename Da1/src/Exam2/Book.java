package Exam2;

public class Book {
    private String bookName;
    private int bookPrice;
    private Author bookAuthor;
    public void setBookName(String bookName)
    {
        this.bookName=bookName;
    }
    public String getBookName()
    {
        return bookName;
    }
    public void setBookPrice(int bookPrice)
    {
        this.bookPrice=bookPrice;
    }
    public int getBookPrice()
    {
        return  bookPrice;
    }
    public void setBookAuthor(Author bookAuthor)
    {
        this.bookAuthor=bookAuthor;
    }
    public Author getBookAuthor()
    {
        return  bookAuthor;
    }
    public Book(){};
    public Book(String bookName,int bookPrice,Author bookAuthor)
    {
        setBookAuthor(bookAuthor);
        setBookName(bookName);
        setBookPrice(bookPrice);
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookAuthor=" + bookAuthor +
                '}';
    }
}
