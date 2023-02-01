package shop.mtcoding.demo.model;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private Integer id; // PK
    private String username;
    private String password;
    private String email;
    private LocalDateTime createdAt; // 자바 1.8부터 나온 시간 타입

}
