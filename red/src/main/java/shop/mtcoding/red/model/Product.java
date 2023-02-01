package shop.mtcoding.red.model;


import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

// DB 테이블 모델링 클래스
@Setter
@Getter
@Entity
@Table(name = "product")
public class Product { // Entity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer price;
    private Integer qty;
    private Timestamp createdAt;
}
