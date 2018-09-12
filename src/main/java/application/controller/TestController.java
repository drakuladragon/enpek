package application.controller;

import application.data.model.Comment;
import application.data.model.Product;
import application.data.service.CommentService;
import application.data.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/")
public class TestController {

    @Autowired
    CommentService commentService;

    @GetMapping("comment")
    public String getProductInfo(Model model) {
        List<Comment> comments = commentService.getAll();

        model.addAttribute("commentList",comments);

        return "comment";
    }

}
