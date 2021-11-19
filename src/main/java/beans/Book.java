package beans;

import org.springframework.stereotype.Component;

@Component
public class Book {

    //fields
    private String bookTitle;
    private String bookType;
    BookPublisher bookPublisher;

    //constructors

    public Book() {
    }

    public Book(String bookTitle, String bookType, BookPublisher bookPublisher) {
        this.bookTitle = bookTitle;
        this.bookType = bookType;
        this.bookPublisher = bookPublisher;
    }

    //getters & setters

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public BookPublisher getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(BookPublisher bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    //to String


    @Override
    public String toString() {
        return "beans.Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookType='" + bookType + '\'' +
                ", bookPublisher=" + bookPublisher +
                '}';
    }
}
