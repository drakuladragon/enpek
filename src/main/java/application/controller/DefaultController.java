package application.controller;

import application.data.model.Product;
import application.data.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/")
public class DefaultController {

    @Autowired
    ProductService productService;

    @GetMapping({"/", "/main"})
    public String getMenu(Model model) {

        model.addAttribute("paginableItem",productService.getListProducts(3,0));
        return "main";
    }
}
