package beans;

import org.springframework.stereotype.Component;

@Component
public class BookPublisher {
    //fields
    private int publisherId;
    private String firstName;
    private String lastName;

    //constructors

    public BookPublisher() {
    }

    public BookPublisher(int publisherId, String firstName, String lastName) {
        this.publisherId = publisherId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getters & setters


    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //toString method


    @Override
    public String toString() {
        return "beans.BookPublisher{" +
                "publisherId=" + publisherId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
