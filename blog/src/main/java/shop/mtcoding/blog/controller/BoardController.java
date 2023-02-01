package shop.mtcoding.blog.controller;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import shop.mtcoding.blog.model.BoardRepository;

@Controller
public class BoardController {
    
    @Autowired
    private BoardRepository boardRepository;


    @GetMapping("/board/list")
    public String loginForm(){
        return "user/loginForm";
    }
}
