package config;

import beans.Book;
import beans.BookPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean(name = "book")
    public Book getBookDetails() {
        Book book = new Book();
        book.setBookTitle("Application Context vs Spring Bean Factory");
        book.setBookType("Reference");
        book.setBookPublisher(getPublisherDetails());
        return book;
    }
    @Bean(name = "bookPublisher")
    public BookPublisher getPublisherDetails() {
        BookPublisher bookPublisher = new BookPublisher();
        bookPublisher.setPublisherId(101);
        bookPublisher.setFirstName("Henry");
        bookPublisher.setLastName("SFG");
        return bookPublisher;
    }
}
