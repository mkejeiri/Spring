package com.kejeiri.course.SimpleSpringApp.Bootstrap;

import com.kejeiri.course.SimpleSpringApp.Repositories.AuthorRespository;
import com.kejeiri.course.SimpleSpringApp.Repositories.BookRespository;
import com.kejeiri.course.SimpleSpringApp.Repositories.PublisherRespository;
import com.kejeiri.course.SimpleSpringApp.model.Author;
import com.kejeiri.course.SimpleSpringApp.model.Book;
import com.kejeiri.course.SimpleSpringApp.model.Publisher;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component //that make this as spring bean and wired up by a spring context
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private AuthorRespository authorRespository;
    private BookRespository bookRespository;
    private PublisherRespository publisherRespository;

    public DevBootstrap(AuthorRespository authorRespository, BookRespository bookRespository, PublisherRespository publisherRespository) {
        this.authorRespository = authorRespository;
        this.bookRespository = bookRespository;
        this.publisherRespository = publisherRespository;
    }

    private void initData(){
            //Eric
            Author eric = new Author("Eric","Evans");
            Publisher hc = new Publisher("Harper collins","5th av new york");
            Book ddd = new Book("Domain Driven Design","123", hc);
            eric.getBooks().add(ddd);
            authorRespository.save(eric);
            publisherRespository.save(hc);
            bookRespository.save(ddd);

        //Rod
        Author rod = new Author("Rod","Johnson");
        Publisher wrox = new Publisher("Wrox","Av los alamos, California");
        Book noEjb = new Book("J2EE Development without Ejb","2444",wrox);
        rod.getBooks().add(noEjb);
        authorRespository.save(rod);
        publisherRespository.save(wrox);
            bookRespository.save(noEjb);
        }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
