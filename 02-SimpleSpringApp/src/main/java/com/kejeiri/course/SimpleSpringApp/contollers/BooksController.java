package com.kejeiri.course.SimpleSpringApp.contollers;

import com.kejeiri.course.SimpleSpringApp.Repositories.BookRespository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//registration of the class: Spring will detect this class as 'spring bean', create a class for us
// and wires it into class context..
@Controller
public class BooksController {
    private BookRespository bookRespository;

    public BooksController(BookRespository bookRespository) {
        this.bookRespository = bookRespository;
    }

    @RequestMapping("/books") //route
    public  String getBooks(Model model){//we return a view name
        //passing a model which an interface, Spring will pass its implementation at runtime when this method is invoked!

        model.addAttribute("viewDataBooks",bookRespository.findAll()); //books is name inside the thymeleaf view which hold data
        return "books"; //view called books
    }
}
