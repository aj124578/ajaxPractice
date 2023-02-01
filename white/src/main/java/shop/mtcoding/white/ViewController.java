package shop.mtcoding.white;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller // 파일을 리턴하는 소켓
public class ViewController {
    
    @GetMapping("/login")
    public String login(Model model){
        Random r = new Random();
        int result = r.nextInt(10);
        model.addAttribute("num", result);
        return "login"; // 무조건 ViewResolver 발동
    }
    
    @GetMapping("/join")
    public String join(){
        return "join";
    }

    @GetMapping("/write")
    public String write(){
        return "board/write";
    }

    

}
