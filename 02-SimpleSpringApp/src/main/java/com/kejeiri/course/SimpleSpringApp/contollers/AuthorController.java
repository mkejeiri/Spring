package com.kejeiri.course.SimpleSpringApp.contollers;

import com.kejeiri.course.SimpleSpringApp.Repositories.AuthorRespository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private AuthorRespository authorRespository;

    public AuthorController(AuthorRespository authorRespository) {
        this.authorRespository = authorRespository;
    }
    @RequestMapping("/authors")
    public String getAuthors(Model model){
        model.addAttribute("viewDataAuthors",authorRespository.findAll());
        return "authors";
    }
}
