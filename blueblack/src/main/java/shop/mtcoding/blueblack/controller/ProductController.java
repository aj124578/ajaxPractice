package shop.mtcoding.blueblack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import shop.mtcoding.blueblack.model.Product;
import shop.mtcoding.blueblack.model.ProductRepository;

@RestController
public class ProductController {
    
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/product/{id}/{name}")
    public Product fineOneNameProduct(@PathVariable String name){
        Product product = productRepository.fineOneName(name);
        return product;
    }

    @GetMapping("/product/{id}")
    public Product findOneProduct(@PathVariable int id){
        Product product = productRepository.findOne(id);
        return product;

    } 

    @GetMapping("/product")
    public List<Product> findAllProduct(){
        List<Product> productList = productRepository.findAll();
        return productList;
    }
}
