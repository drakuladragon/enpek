package application.data.service;

import application.data.model.BlogPost;
import application.data.model.PaginableItemList;
import application.data.model.Product;
import application.data.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    public void addNewProduct(BlogPost blogPost) {
        blogRepository.save(blogPost);
    }

    @Transactional
    public void addNewListProducts(List<BlogPost> blogPosts) {
        blogRepository.save(blogPosts);
    }


    public List<BlogPost> getAll(){
        return blogRepository.getAllPost();
    }

}
