package shop.mtcoding.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController
public class YellowController {
    // SELECT(GET), INSERT(POST), UPDATE(PUT), DELETE(DELETE)

    /*
     * 주소값
     * QueryString (host:포트/endpoint?username=ssar&password=1234&email=ssar@nate.com)
     *
     */
    @GetMapping("/user")
    public void user(String username, String password, String email) {
        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("email : " + email);
    }


    /*
     * application/x-www-from-urlencode
     * body값으로 들어감
     * username=ssar&password=1234&email=ssar@nate.com
     */

     // 1차 프로젝트에서 form 태그 만들어서 Post요청으로 update, delete, insert
     // http 1.0 프로토콜 회사에서는 http 1.1 쓰고있음
     // @PostMapping("/user/insert") 등으로 명명해서 작성
    @PostMapping("/user")
    public void insert(String username, String password, String email){
        System.out.println("POST 요청됨");
        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("email : " + email);
    }
    
}
