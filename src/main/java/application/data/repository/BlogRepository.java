package application.data.repository;

import application.data.model.BlogPost;
import application.data.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogRepository extends JpaRepository<BlogPost,Integer> {

    @Query("select b from tbl_blog b")
    List<BlogPost> getAllPost();

}
