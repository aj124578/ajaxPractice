package shop.mtcoding.red.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// DB에 접근하는 클래스
@Repository
public class ProductRepository {
    
    @Autowired // DI (Dependency Injection = 의존성 주입)
    EntityManager em; 

    // 한건 product 가져오기
    public Product findOne(int id) {
        String sql = "select * from product where id = :idx";
        Query query = em.createNativeQuery(sql, Product.class);
        query.setParameter("idx", id);
        Product product = (Product) query.getSingleResult();
        return product;
    }





    // 전체 Product 가져오기
    public List<Product> findAll(){
        String sql = "select * from product";
        Query query = em.createNativeQuery(sql, Product.class);
        List<Product> productList = query.getResultList();
        return productList;
        // System.out.println(productList.size());
        // System.out.println();
        // for (Product product : productList) {
        //     System.out.println("디버그 : " + product.getName());
        // }
    }


}
