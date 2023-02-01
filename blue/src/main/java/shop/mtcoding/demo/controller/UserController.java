package shop.mtcoding.demo.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.demo.model.User;

@Controller
public class UserController {
    
    @GetMapping("/loginForm")
    public String loginForm() {
        return "user/loginForm";
    }

    @GetMapping("/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }
   
    @PostMapping("/login")
    public String login(String username, String password, HttpServletRequest request){
        // 1. DB 연결
        // 2. select문 실행
        String sql = "select * from user where username=? and password=?";
        // 3. main 페이지 이동

        // stub 데이터
        User user = new User();
        user.setId(1);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail("ssar@nate.com");
        user.setCreatedAt(LocalDateTime.now());

        HttpSession session = request.getSession();
        session.setAttribute("user", user);

        System.out.println("로그인 실행됨");
        System.out.println("username : " + username);
        System.out.println("password : " + password);
        if(user == null){
            return "redirect:/loginForm";
        }else{
            return "redirect:/";
        }

    }

    @PostMapping("/join")
    public String join(String username, String password, String email){
        // 1. DB 연결
        // 2. insert문 실행 (정상확인)
        String sql = "insert into user(username, password, email) values(?,?,?)";
        // 3. 로그인 페이지로 가기

        System.out.println("회원가입 실행됨");
        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("email : " + email);
        return "redirect:/loginForm"; // 리다이렉션 됨
    }
}
