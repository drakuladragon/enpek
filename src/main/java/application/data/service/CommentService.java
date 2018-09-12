package application.data.service;

import application.data.model.BlogPost;
import application.data.model.Comment;
import application.data.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepo commentRepo;

    public void addNewProduct(Comment comment) {
        commentRepo.save(comment);
    }

    @Transactional
    public void addNewListProducts(List<Comment> comments) {
        commentRepo.save(comments);
    }


    public List<Comment> getAll(){
        return commentRepo.getAll();
    }

}
