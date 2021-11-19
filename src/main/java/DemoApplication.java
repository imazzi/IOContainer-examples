import beans.Book;
import beans.BookPublisher;
import config.BeanConfiguration;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class DemoApplication {

    public static void main(String[] args){

        //using bean factory
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        System.out.println(factory);

        Book book = (Book) factory.getBean("book");
        System.out.println(book);

        BookPublisher bookPublisher =(BookPublisher) factory.getBean("bookPublisher2");
        System.out.println(bookPublisher);

        //Using ApplicationCntext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(context);
        Book book2 = (Book) context.getBean("book");
        System.out.println(book2);

        //Annotation-configuration
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(BeanConfiguration.class);
        annotationConfigApplicationContext.refresh();
        System.out.println(annotationConfigApplicationContext);

        Book book3 = (Book) annotationConfigApplicationContext.getBean("book");
        System.out.println(book3);

        //FileSystemXmlApplication-context
        ApplicationContext context2 = new FileSystemXmlApplicationContext("beans1.xml");
        System.out.println(context2);

        Book book4 = (Book) context2.getBean("book");
        System.out.println(book4);







    }

}
