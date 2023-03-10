package shop.mtcoding.banana.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductRepository {
    public List<Product> findAll();

    public Product findOne(int id);

    public int insert(@Param("name") String name, @Param("price") int price, @Param("qty") int qty);

    public int delete(@Param("id") int id);

}
