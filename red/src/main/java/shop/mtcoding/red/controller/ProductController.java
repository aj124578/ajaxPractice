package shop.mtcoding.red.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import shop.mtcoding.red.model.Product;
import shop.mtcoding.red.model.ProductRepository;

// 클라이언트와 통신하는 클래스
@RestController
public class ProductController {
    
    @Autowired
    ProductRepository productRepository;

    // http:/localhost:8080/product/1
    @GetMapping("/product/{id}") // pathvariable은 pk 조회시 사용
    public Product findOneProduct(@PathVariable int id){
        Product product = productRepository.findOne(id);
        return product;
    }

    @GetMapping("/product")
    public List<Product> findAllProduct(){
        List<Product> productList = productRepository.findAll();
        return productList; // MewssageConverter
    }
}
