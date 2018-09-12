package application.data.repository;

import application.data.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment,Integer> {

    @Query("select c from tbl_comment c")
    List<Comment> getAll();

}
