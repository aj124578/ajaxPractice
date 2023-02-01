package shop.mtcoding.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// @Controller
public class jspController {

    
    @GetMapping("/joinForm") //주소에 joinForm 요청하면 찾아줌
    public String joinForm() {
        return "joinForm";
    }
    
    
}
