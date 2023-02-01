package shop.mtcoding.blueblack.model;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    @Autowired
    EntityManager em;

    public Product fineOneName(String name){
        String sql = "select * from product where name = :name";
        Query query = em.createNativeQuery(sql, Product.class);
        query.setParameter("name", name);
        Product product = (Product)query.getSingleResult();
        return product;
    }

    public Product findOne(int id){
        String sql = "select * from product where id = :idx";
        Query query = em.createNativeQuery(sql, Product.class);
        query.setParameter("idx", id);
        Product product = (Product)query.getSingleResult();
        return product;
    }

    public List<Product> findAll() {
        String sql = "select * from product";
        Query query = em.createNativeQuery(sql, Product.class);
        List<Product> productList = query.getResultList();
        return productList;
    }
}
