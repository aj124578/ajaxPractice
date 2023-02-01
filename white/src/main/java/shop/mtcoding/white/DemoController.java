package shop.mtcoding.white;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * http://아이피:8080/hello
 * http://아이피:8080/bye
 */

@RestController // 문자열을 리턴하는 소켓
public class DemoController {
    
    @GetMapping("/hello") // endpoint를 작성
    public void hello(){
        System.out.println("디버그 : hello");
    }
    
    @GetMapping("/bye")
    public void bye(){
        System.out.println("디버그 : bye");

    }

    @GetMapping("/home")
    public String home(){ 
        System.out.println("디버그 : bye");
        String name = "홍길동";
        String html = "<h1>Home : " + name + "</h1><hr/>";
        return html;
    }

    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setId(1);
        user.setUsername("ssar");
        user.setPassword("1234");
        return user; // MessageConverter 발동 (Object를 리턴할때)
    }

    @GetMapping("/number")
    public int number(){
        return 5;
    }
}
