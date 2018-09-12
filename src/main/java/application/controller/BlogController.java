package application.controller;

import application.data.model.BlogPost;
import application.data.model.Product;
import application.data.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/")
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("blog")
    public String getProductInfo(Model model){
        List<BlogPost> blogPosts = blogService.getAll();

        model.addAttribute("blogList",blogPosts);
        return "blog";
    }

}
