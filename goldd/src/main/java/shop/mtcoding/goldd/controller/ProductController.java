package shop.mtcoding.goldd.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import shop.mtcoding.goldd.model.Product;
import shop.mtcoding.goldd.model.ProductRepository;

@Controller
public class ProductController {
    
    @Autowired
    ProductRepository productRepository;

    @Autowired
    HttpSession httpSession;

    @GetMapping({"/", "/product"})
    public String findAll(Model model){
        List<Product> productList = productRepository.findAll();
        model.addAttribute("productList", productList);
        return "product/list";
    }

    @GetMapping("product/{id}")
    public String findById(@PathVariable int id, Model model){
        Product product = productRepository.findById(id);
        if (product == null) {
            return "redirect:/notfound";
        } else {
            model.addAttribute("product", product);
            return "product/detail";
        }

    }

}
