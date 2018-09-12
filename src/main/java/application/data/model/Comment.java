package application.data.model;

import javax.persistence.*;

@Entity(name = "tbl_comment")
public class Comment {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "comment_id")
    @Id
    private String id;

    @Column(name = "name")
    private String name;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
