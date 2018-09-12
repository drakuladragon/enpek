package application.controller;

import application.data.model.Product;
import application.data.service.ProductService;
import application.viewmodel.common.ProductVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/")
public class ShopController {

    @Autowired
    ProductService productService;

    @GetMapping("shop")
    public String getProductInfo(Model model) {
        List<Product> products = productService.getAll();
        System.out.println(products.get(0).getUrl());

        model.addAttribute("productList",products);

        return "shop";
    }


}
