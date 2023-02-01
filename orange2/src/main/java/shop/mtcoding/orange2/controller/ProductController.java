package shop.mtcoding.orange2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.orange2.model.Product;
import shop.mtcoding.orange2.model.ProductRepository;



@Controller
public class ProductController {
    
    @Autowired
    ProductRepository productRepository;

    @GetMapping({"/", "/product"})
    public String findAll(Model model) {
        List<Product> everyList = productRepository.findAll();
        model.addAttribute("productList", everyList);
        return "product/main";
    }

    @GetMapping("/product/{id}")
    public String findOne(@PathVariable int id, Model model){
        Product product = productRepository.findOne(id);
        model.addAttribute("product", product);
        return "product/detail";
    }

    @GetMapping("/product/addForm")
    public String addForm() {
        return "product/addForm";
    }
    
    @PostMapping("/product/add")
    public String add(String name, int price, int qty) {
        int result = productRepository.insert(name, price, qty);

        if (result == 1) {
            return "redirect:/product";
        } else {
            return "redirect:/product/addForm";
        }
        
    }
    

}
