package shop.mtcoding.white;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * http://아이피:8080/hello
 * http://아이피:8080/bye
 */

@RestController
public class DemoController2 {
    @GetMapping("/test")
    public Test test(){
        Test test = new Test();
        test.setId(1);
        test.setName("Leanne Graham");
        test.setUsername("Bret");
        test.setEmail("Sincere@april.biz");
        // test.setAddress("Kulas Light");
        // test.getAddress().getGeo().setLat("-37.3159");
        // test.getAddress().getGeo().setLng("81.1496");

        return test;
    }
   


}
