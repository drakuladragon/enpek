package application.data.model;

import javax.persistence.*;

@Entity(name = "tbl_blog")
public class BlogPost {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "blog_id")
    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;

    @Column(name = "content")
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
