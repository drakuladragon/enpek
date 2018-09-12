package application.data.repository;

import application.data.model.BlogPost;
import application.data.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer>{

    @Query("select count(product_id) from tbl_product p")
    long getAllProductQuantity();

    @Query("select p from tbl_product p")
    List<Product> getAllProduct();



}
